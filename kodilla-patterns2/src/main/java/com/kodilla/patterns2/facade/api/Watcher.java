package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order) && args(userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " Args: " + userId + " " + order.toString());
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        long begin = System.currentTimeMillis();
        result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        LOGGER.info("Time consumed: " + (end - begin) + "[ms]");

        return result;
    }
}
