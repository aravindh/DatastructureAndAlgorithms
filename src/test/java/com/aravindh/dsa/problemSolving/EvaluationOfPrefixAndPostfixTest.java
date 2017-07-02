package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 2/7/17.
 */
@RunWith(value = JUnit4.class)
public class EvaluationOfPrefixAndPostfixTest {

    EvaluationOfPrefixAndPostfix evaluator = new EvaluationOfPrefixAndPostfix();

    @Test
    public void evaluatePrefixWithNonEmptyExpressionReturnsValue(){
        Assert.assertEquals(17,evaluator.evaluatePrefix("- + * 2 3 * 5 4 9"));
        Assert.assertEquals(76,evaluator.evaluatePrefix("- + * 10 3 * 5 11 9"));
    }

    @Test
    public void evaluatePrefixWithEmptyExpressionReturnsZero(){
        Assert.assertEquals(0,evaluator.evaluatePrefix(""));
    }

    @Test
    public void evaluatePostfixWithEmptyExpressionReturnsZero(){
        Assert.assertEquals(0,evaluator.evaluatePostfix(""));
    }

    @Test
    public void evaluatePostfixWithNonEmptyExpressionReturnsValue(){
        Assert.assertEquals(17,evaluator.evaluatePostfix("2 3 * 5 4 * + 9 -"));
        Assert.assertEquals(76,evaluator.evaluatePostfix("10 3 * 5 11 * + 9 -"));
    }
}