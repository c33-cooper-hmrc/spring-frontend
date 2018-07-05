package com.spring.springfrontend.utils;

import org.junit.Assert;
import org.junit.Test;
import java.util.Optional;

public class NameUtilsSpec {

    @Test
    public void getNameTest_1() {

        System.out.println("getNameTest() should return a default 'not-not-defined' String when applied an Optional.empty()");

        NameUtils nameUtilsSpec = new NameUtils( Optional.empty() );

        String actualResult = nameUtilsSpec.getName();
        String expectedResult = "name-not-defined";

        Assert.assertEquals("getNameTest() should return a default 'not-not-defined' String when applied an Optional.empty()", expectedResult, actualResult );
    }

    @Test
    public void getNameTest_2() {

        System.out.println("getNameTest() should return a String when applied an Optional.of( String )");

        NameUtils nameUtilsSpec = new NameUtils( Optional.of("Joe Bloggs") );

        String actualResult = nameUtilsSpec.getName();
        String expectedResult = "Joe Bloggs";

        Assert.assertEquals("getNameTest() should return a String when applied an Optional.of( String )", expectedResult, actualResult );
    }
}
