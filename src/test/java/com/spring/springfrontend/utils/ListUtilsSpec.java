package com.spring.springfrontend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListUtilsSpec {

    @Test
    public void getNamesTest_1() {

        System.out.println("getNames() should return a list of names when initialised with a list of names");

        ListUtils listUtilsSpec = new ListUtils(new ArrayList<String>() {{
            add("Callum");
            add("Emily");
            add("Joe");
        }});

        List<String> actualResult = listUtilsSpec.getNames();
        ArrayList<String> expectedResult = new ArrayList<String>() {{
            add("Callum");
            add("Emily");
            add("Joe");
        }};

        Assert.assertEquals("getNames() should return a list of names when initialised with a list of names", expectedResult, actualResult);
    }

    @Test
    public void getNamesTest_2() {

        System.out.println("getNames() should return an empty list when initialised with an empty list");

        ListUtils listUtilsSpec = new ListUtils(new ArrayList<>());

        List<String> actualResult = listUtilsSpec.getNames();
        ArrayList<String> expectedResult = new ArrayList<>();

        Assert.assertEquals("getNames() should return an empty list when initialised with an empty list", expectedResult, actualResult);
    }
}
