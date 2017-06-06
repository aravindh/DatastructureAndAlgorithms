package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 6/6/17.
 */
@RunWith(value = JUnit4.class)
public class UrlifyTest {
    Urlify urlify = new Urlify();

    private char[] getCharArrayWithSpace(String str){
        int countSpace = 0;
        for(Character c : str.toCharArray()){
            if(c == ' '){
                countSpace++;
            }
        }
        char[] chars = new char[str.length()+(countSpace*2)];
        int idx = 0;
        for(Character c : str.toCharArray()){
            chars[idx++] = c;
        }
        return chars;
    }

    private boolean isEquals(char[] src, char[] target){
        for(int i =0; i < Math.min(src.length, target.length); i++){
            if(src[i] != target[i]){
                return false;
            }
        }
        return true;
    }

    @Test
    public void urlifyStringWithSingleSpaceBetweenWordsUrlfiesInputString(){
        //char[] str = getCharArrayWithSpace("This is a test string");
        String actualString = "Hello world";
        char[] str = getCharArrayWithSpace(actualString);
        urlify.urlify(str, actualString.length());
        Assert.assertEquals("Hello%20world", new String(str));
    }

    @Test
    public void urlifyStringEndsWithSpaceUrlfiesInputString(){
        String actualString = "This is a test string ";
        char[] str = getCharArrayWithSpace(actualString);
        urlify.urlify(str, actualString.length());
        Assert.assertTrue(isEquals("This%20is%20a%20test%20string%20".toCharArray(), str));
    }

    @Test
    public void urlifyStringStartsWithSpaceUrlfiesInputString(){
        String actualString = " This is a test string";
        char[] str = getCharArrayWithSpace(actualString);
        urlify.urlify(str, actualString.length());
        Assert.assertEquals("%20This%20is%20a%20test%20string", new String(str));
    }

    @Test
    public void urlifyStringEmptyStringUrlifyModifiesNothing(){
        String actualString = "";
        char[] str = getCharArrayWithSpace(actualString);
        urlify.urlify(str, actualString.length());
        Assert.assertEquals("", new String(str));
    }

    @Test
    public void urlifyStringWithMultipleSpacesBetweenWordsUrlfiesInputString(){
        String actualString = "This  is  a  test string";
        char[] str = getCharArrayWithSpace(actualString);
        urlify.urlify(str, actualString.length());
        Assert.assertEquals("This%20%20is%20%20a%20%20test%20string", new String(str));
    }
}