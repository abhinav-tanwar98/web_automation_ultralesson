/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.ultralesson.training.web;

import org.asynchttpclient.util.Assertions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void addTwoPositiveNumbers(){
        //Arrange
        int firstNumber = 1;
        int secondNumber = 2;

        //Act
        int result = firstNumber + secondNumber;

        //Assert
        Assert.assertEquals(result,3);
    }

}
