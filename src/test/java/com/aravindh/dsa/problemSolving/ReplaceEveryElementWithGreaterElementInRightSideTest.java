package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class ReplaceEveryElementWithGreaterElementInRightSideTest {

    ReplaceEveryElementWithGreaterElementInRightSide replaceEveryElementWithGreaterElementInRightSide = new ReplaceEveryElementWithGreaterElementInRightSide();

    @Test
    public void replaceWithEmptyListReturnsEmptyList(){
        List<Integer> elements = Collections.emptyList();
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertTrue(elements.isEmpty());
    }

    @Test
    public void replaceWithNonEmptyListInAscendingOrderReplacesAllWithGreatest(){
        List<Integer> elements = new ArrayList<>(5);
        elements.add(1);elements.add(2);elements.add(3);elements.add(4);elements.add(5);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertEquals("[5, 5, 5, 5, 5]", elements.toString());
    }

    @Test
    public void replaceWithNonEmptyListInDescendingOrderReturnsSameElements(){
        List<Integer> elements = new ArrayList<>(5);
        elements.add(5);elements.add(4);elements.add(3);elements.add(2);elements.add(1);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertEquals("[5, 4, 3, 2, 1]", elements.toString());
    }

    @Test
    public void replaceWithNonEmptyListInUnsortedReplacesWithGreaterElements(){
        List<Integer> elements = new ArrayList<>(5);
        elements.add(1);elements.add(2);elements.add(5);elements.add(4);elements.add(3);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertEquals("[5, 5, 5, 4, 3]", elements.toString());
    }

    @Test
    public void replaceWithSingleElementInListReturnsSameElements(){
        List<Integer> elements = new ArrayList<>(1);
        elements.add(1);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertEquals("[1]", elements.toString());
    }

    @Test
    public void replaceWithTwoElementInListReturnsSameElements(){
        List<Integer> elements = new ArrayList<>(2);
        elements.add(1);elements.add(2);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements);
        Assert.assertEquals("[2, 2]", elements.toString());

        List<Integer> elements1 = new ArrayList<>(2);
        elements1.add(2);elements1.add(1);
        replaceEveryElementWithGreaterElementInRightSide.replace(elements1);
        Assert.assertEquals("[2, 1]", elements1.toString());
    }

}