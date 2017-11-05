package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class GetInitialsTest {

    GetInitials getInitials = new GetInitials();

    @Test
    public void getInitialsWithSingleWordReturnsFirstThreeCharacters(){
        Assert.assertEquals("gee", getInitials.getInitials("geeks"));
    }

    @Test
    public void getInitialsWithTwoWordsReturnsFirstCharactersOfTwoWords(){
        Assert.assertEquals("gg", getInitials.getInitials("geeks geeks"));
    }

    @Test
    public void getInitialsWithMoreThanThreeWordsReturnsFirstThreeCharactersOfFirstThreeWords(){
        Assert.assertEquals("gfg", getInitials.getInitials("geeks  for   geeks computer science"));
    }

    @Test
    public void getInitialsWithSingleCharacterWordReturnsFirstCharacter(){
        Assert.assertEquals("g", getInitials.getInitials("g"));
    }

}