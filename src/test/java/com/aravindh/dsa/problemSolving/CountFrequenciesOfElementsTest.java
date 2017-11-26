package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 26/11/17.
 */
@RunWith(value = JUnit4.class)
public class CountFrequenciesOfElementsTest {

    CountFrequenciesOfElements countFrequenciesOfElements = new CountFrequenciesOfElements();

    @Test
    public void countWithAllUniqueNumbersReturnsFrequencies(){
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        countFrequenciesOfElements.count(elements);
        Assert.assertEquals(Integer.valueOf(1), elements.get(0));
        Assert.assertEquals(Integer.valueOf(1), elements.get(1));
        Assert.assertEquals(Integer.valueOf(1), elements.get(2));
        Assert.assertEquals(Integer.valueOf(1), elements.get(3));
        Assert.assertEquals(Integer.valueOf(1), elements.get(4));
        Assert.assertEquals(Integer.valueOf(1), elements.get(5));
        Assert.assertEquals(Integer.valueOf(1), elements.get(6));

        elements = Arrays.asList(7, 6, 5, 4, 3, 2, 1);
        countFrequenciesOfElements.count(elements);
        Assert.assertEquals(Integer.valueOf(1), elements.get(0));
        Assert.assertEquals(Integer.valueOf(1), elements.get(1));
        Assert.assertEquals(Integer.valueOf(1), elements.get(2));
        Assert.assertEquals(Integer.valueOf(1), elements.get(3));
        Assert.assertEquals(Integer.valueOf(1), elements.get(4));
        Assert.assertEquals(Integer.valueOf(1), elements.get(5));
        Assert.assertEquals(Integer.valueOf(1), elements.get(6));
    }

    @Test
    public void countWithAllDuplicateNumbersReturnsFrequencies(){
        final List<Integer> elements = Arrays.asList(1, 2, 3, 2, 5, 1, 7);
        countFrequenciesOfElements.count(elements);
        Assert.assertEquals(Integer.valueOf(2), elements.get(0));
        Assert.assertEquals(Integer.valueOf(2), elements.get(1));
        Assert.assertEquals(Integer.valueOf(1), elements.get(2));
        Assert.assertEquals(Integer.valueOf(0), elements.get(3));
        Assert.assertEquals(Integer.valueOf(1), elements.get(4));
        Assert.assertEquals(Integer.valueOf(0), elements.get(5));
        Assert.assertEquals(Integer.valueOf(1), elements.get(6));
    }

    @Test
    public void countWithAllSameNumbersReturnsFrequencies(){
        final List<Integer> elements = Arrays.asList(4, 4, 4, 4, 4, 4, 4);
        countFrequenciesOfElements.count(elements);
        Assert.assertEquals(Integer.valueOf(0), elements.get(0));
        Assert.assertEquals(Integer.valueOf(0), elements.get(1));
        Assert.assertEquals(Integer.valueOf(0), elements.get(2));
        Assert.assertEquals(Integer.valueOf(7), elements.get(3));
        Assert.assertEquals(Integer.valueOf(0), elements.get(4));
        Assert.assertEquals(Integer.valueOf(0), elements.get(5));
        Assert.assertEquals(Integer.valueOf(0), elements.get(6));
    }

}