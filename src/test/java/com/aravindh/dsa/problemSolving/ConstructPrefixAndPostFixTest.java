package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 3/7/17.
 */
@RunWith(value = JUnit4.class)
public class ConstructPrefixAndPostFixTest {
    ConstructPrefixAndPostFix constructor = new ConstructPrefixAndPostFix();

    @Test
    public void constructPrefixWithInfixWithoutBracketsReturnsPrefix(){
        Assert.assertEquals("+ A * B C",constructor.constructPrefix("A + B * C"));
    }

    @Test
    public void constructPrefixWithInfixWithBracketsReturnsPrefix(){
        Assert.assertEquals("* + A B C",constructor.constructPrefix("( A + B ) * C"));
    }

    @Test
    public void constructPostfixWithInfixWithoutBracketsReturnsPostfix(){
        Assert.assertEquals("A B C * +",constructor.constructPostfix("A + B * C"));
    }

    @Test
    public void constructPostfixWithInfixWithBracketsReturnsPostfix(){
        Assert.assertEquals("A B + C *",constructor.constructPostfix("( A + B ) * C"));
    }
}