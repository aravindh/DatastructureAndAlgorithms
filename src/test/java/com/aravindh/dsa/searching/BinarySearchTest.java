package com.aravindh.dsa.searching;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 4/7/17.
 */
@RunWith(value = JUnit4.class)
public class BinarySearchTest {

    BinarySearch search = new BinarySearch();

    @Test
    public void searchWithEmptyListReturnFalse(){
        Assert.assertFalse(search.search(Collections.EMPTY_LIST, 7, true));
        Assert.assertFalse(search.search(Collections.EMPTY_LIST, 7, false));
    }

    @Test
    public void searchWithNonEmptyListValidTargetReturnTrue(){
        Assert.assertTrue("Target on right half", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 7, true));
        Assert.assertTrue("Target on right half", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 3, true));
        Assert.assertTrue("Target on end", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 10, true));
        Assert.assertTrue("Target on start", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 1, true));
        Assert.assertTrue("Target on middle", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 5, true));

        Assert.assertTrue("Target on right half", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 7, false));
        Assert.assertTrue("Target on right half", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 3, false));
        Assert.assertTrue("Target on end", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 10, false));
        Assert.assertTrue("Target on start", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 1, false));
        Assert.assertTrue("Target on middle", search.search(Arrays.asList(1,2,3,4,5,6,7,8,9,10), 5, false));
    }

    @Test
    public void searchWithNonEmptyListInValidTargetReturnFalse(){
        Assert.assertFalse("Target less the start", search.search(Arrays.asList(6,7,9,10), 3, true));
        Assert.assertFalse("Target greater than end", search.search(Arrays.asList(6,7,9,10), 3, true));
        Assert.assertFalse("Target in Range not found", search.search(Arrays.asList(6,7,9,10), 3, true));

        Assert.assertFalse("Target less the start", search.search(Arrays.asList(6,7,9,10), 3, false));
        Assert.assertFalse("Target greater than end", search.search(Arrays.asList(6,7,9,10), 3, false));
        Assert.assertFalse("Target in Range not found", search.search(Arrays.asList(6,7,9,10), 3, false));

    }
}