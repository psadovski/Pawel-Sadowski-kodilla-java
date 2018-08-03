package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Sending e-mail");
        //When & Then
        Assert.assertEquals("Sending e-mail", Logger.getInstance().getLastLog());
    }
}
