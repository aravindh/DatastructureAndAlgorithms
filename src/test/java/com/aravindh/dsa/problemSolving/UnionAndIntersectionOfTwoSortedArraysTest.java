package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RunWith(JUnit4.class)
public class UnionAndIntersectionOfTwoSortedArraysTest {

    UnionAndIntersectionOfTwoSortedArrays unionAndIntersectionOfTwoSortedArrays = new UnionAndIntersectionOfTwoSortedArrays();

    @Test
    public void getUnionWithTwoEmptyArraysReturnEmptyList(){
        List<Integer> listA = Collections.EMPTY_LIST;
        List<Integer> listB = Collections.EMPTY_LIST;

        List<Integer> union = unionAndIntersectionOfTwoSortedArrays.getUnion(listA, listB);
        Assert.assertTrue(union.isEmpty());
    }

    @Test
    public void getUnionWithOneOfTheArrayAsEmptyArrayReturnElementsFromNonEmptyArray(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Collections.EMPTY_LIST;

        List<Integer> union = unionAndIntersectionOfTwoSortedArrays.getUnion(listA, listB);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5), union);
    }

    @Test
    public void getUnionWithTwoNonEmptyArraysWithNoCommonElementsReturnAllElementsFromBothArrays(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Arrays.asList(6,7,8,9);

        List<Integer> union = unionAndIntersectionOfTwoSortedArrays.getUnion(listA, listB);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9), union);
    }

    @Test
    public void getUnionWithTwoNonEmptyArraysSameElementsReturnAllElements(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Arrays.asList(1,2,3,4,5);

        List<Integer> union = unionAndIntersectionOfTwoSortedArrays.getUnion(listA, listB);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5), union);
    }

    @Test
    public void getUnionWithTwoNonEmptyArraysWithSomeCommonElementsReturnUnionElements(){
        List<Integer> union = unionAndIntersectionOfTwoSortedArrays.getUnion(Arrays.asList(1,2,3,4,5), Arrays.asList(4,5,6,7));
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7), union);

        List<Integer> union1 = unionAndIntersectionOfTwoSortedArrays.getUnion(Arrays.asList(1,2,3,4,5), Arrays.asList(1,2,6,7));
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7), union1);

        List<Integer> union2 = unionAndIntersectionOfTwoSortedArrays.getUnion(Arrays.asList(1,2,3,4,5), Arrays.asList(1,3,5,7,8,9));
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,7,8,9), union2);
    }

    @Test
    public void getIntersectionWithTwoEmptyArraysReturnEmptyList(){
        List<Integer> listA = Collections.EMPTY_LIST;
        List<Integer> listB = Collections.EMPTY_LIST;

        List<Integer> intersection = unionAndIntersectionOfTwoSortedArrays.getIntersection(listA, listB);
        Assert.assertTrue(intersection.isEmpty());
    }

    @Test
    public void getIntersectionWithOneOfTheArrayAsEmptyArrayReturnEmptyArray(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Collections.EMPTY_LIST;

        List<Integer> intersection = unionAndIntersectionOfTwoSortedArrays.getIntersection(listA, listB);
        Assert.assertTrue(intersection.isEmpty());
    }

    @Test
    public void getIntersectionWithTwoNonEmptyArraysWithNoCommonElementsReturnEmptyArray(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Arrays.asList(6,7,8,9);

        List<Integer> intersection = unionAndIntersectionOfTwoSortedArrays.getIntersection(listA, listB);
        Assert.assertTrue(intersection.isEmpty());
    }

    @Test
    public void getIntersectionWithTwoNonEmptyArraysSameElementsReturnAllElements(){
        List<Integer> listA = Arrays.asList(1,2,3,4,5);
        List<Integer> listB = Arrays.asList(1,2,3,4,5);

        List<Integer> intersection = unionAndIntersectionOfTwoSortedArrays.getIntersection(listA, listB);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5), intersection);
    }

    @Test
    public void getIntersectionWithTwoNonEmptyArraysWithSomeCommonElementsReturnCommonElements(){
        List<Integer> intersection = unionAndIntersectionOfTwoSortedArrays.getIntersection(Arrays.asList(1,2,3,4,5), Arrays.asList(4,5,6,7));
        Assert.assertEquals(Arrays.asList(4,5), intersection);

        List<Integer> intersection1 = unionAndIntersectionOfTwoSortedArrays.getIntersection(Arrays.asList(1,2,3,4,5), Arrays.asList(1,2,6,7));
        Assert.assertEquals(Arrays.asList(1,2), intersection1);

        List<Integer> intersection2 = unionAndIntersectionOfTwoSortedArrays.getIntersection(Arrays.asList(1,2,3,4,5), Arrays.asList(1,3,5,7,8,9));
        Assert.assertEquals(Arrays.asList(1,3,5), intersection2);
    }
}