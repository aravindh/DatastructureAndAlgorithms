package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 1/7/17.
 */
@RunWith(value = JUnit4.class)
public class BalancingParenthesesTest {

    BalancingParentheses balancingParentheses = new BalancingParentheses();

    @Test
    public void checkParenthesesWithUnEqualNumberOfBracketsReturnFalse(){
        Assert.assertFalse(balancingParentheses.checkParentheses("(}{["));
    }

    @Test
    public void checkParenthesesWithEqualNumberOfBracketsButDifferentOrderReturnFalse(){
        Assert.assertFalse(balancingParentheses.checkParentheses("(}{[)]"));
        Assert.assertFalse(balancingParentheses.checkParentheses(")}{[)]"));
    }

    @Test
    public void checkParenthesesWithBalancedBracketsReturnTrue(){
        Assert.assertTrue(balancingParentheses.checkParentheses("(){}[]"));
        Assert.assertTrue(balancingParentheses.checkParentheses("{([])}"));
    }
}