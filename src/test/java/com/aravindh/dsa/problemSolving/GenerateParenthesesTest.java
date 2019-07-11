package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(value = JUnit4.class)
public class GenerateParenthesesTest {

    GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    public void generateWithInValidNReturnsEmptyList(){
        Assert.assertTrue(generateParentheses.generate(0).isEmpty());
        Assert.assertTrue(generateParentheses.generate(-1).isEmpty());
    }

    @Test
    public void generateWithValidNReturnsEmptyList(){
        List<String> list = Arrays.asList("()");
        Assert.assertEquals(list, generateParentheses.generate(1));

        list = Arrays.asList("(())", "()()");
        Collections.sort(list);
        Assert.assertEquals(list, generateParentheses.generate(2));

        list = Arrays.asList("((()))", "()(())", "(())()", "(()())", "()()()");
        Collections.sort(list);
        Assert.assertEquals(list, generateParentheses.generate(3));

        list = Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()");
        Collections.sort(list);
        Assert.assertEquals(list, generateParentheses.generate(4));
    }

}