package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double actualAdd = calculator.add(5, 5);
        double actualSub = calculator.sub(5, 5);
        double actualMul = calculator.mul(5, 5);
        double actualDiv = calculator.div(5, 5);

        //Then
        Assert.assertEquals(10, actualAdd, 0.01);
        Assert.assertEquals(0, actualSub, 0.01);
        Assert.assertEquals(25, actualMul, 0.01);
        Assert.assertEquals(1, actualDiv, 0.01);

    }
}
