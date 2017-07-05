package com.aravindh.dsa.sorting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 23/6/17.
 */
@RunWith(value = JUnit4.class)
public class SortTest {

    private ISort sort = null;
    private String sortAlgorithmName = "";

    @Test
    public void testAllSorting(){
        sort = new BubbleSort();
        sortAlgorithmName = "Bubble Sort";
        allTests();
        //sort = new HeapSort();
        //allTests();
        sort = new SelectionSort();
        sortAlgorithmName = "Selection sort";
        allTests();

        sort = new InsertionSort();
        sortAlgorithmName = "Insertion sort";
        allTests();
    }

    @Test
    public void allTests(){
        sortWithEmptyListNoModificationOnList();
        sortWithSortedListNoModificationOnList();
        sortWithSortedInReverseOrderSortsTheList();
        sortWithPositiveAndNegativeNumbersInListSortsTheList();
        sortWithRandomNumbersInListSortsTheList();
    }

    @Test
    public void sortWithEmptyListNoModificationOnList(){
        List<Integer> list = Collections.emptyList();
        sort.sort(list);
    }

    @Test
    public void sortWithSortedListNoModificationOnList(){
        List<Integer> list = Arrays.asList(0, 1, 2, 4, 6, 8, 10);
        sort.sort(list);
        Assert.assertTrue(sortAlgorithmName+" ", isSorted(list));
    }

    @Test
    public void sortWithSortedInReverseOrderSortsTheList(){
        List<Integer> list = Arrays.asList(10,8,6,4,2,1,0);
        sort.sort(list);
        Assert.assertTrue(sortAlgorithmName+" ", isSorted(list));
    }

    @Test
    public void sortWithPositiveAndNegativeNumbersInListSortsTheList(){
        List<Integer> list = Arrays.asList(0, 1, 2, -4, 6, -8, 10);
        sort.sort(list);
        Assert.assertTrue(sortAlgorithmName+" ", isSorted(list));
    }

    @Test
    public void sortWithRandomNumbersInListSortsTheList(){
        List<Integer> list = Arrays.asList(17, 65, 81, 43, 496, 10);
        sort.sort(list);
        Assert.assertTrue(sortAlgorithmName+" ", isSorted(list));
    }

    @Test
    public void sortWithSingleNumberInListNoModificationOnList(){
        List<Integer> list = Arrays.asList(6);
        sort.sort(list);
        Assert.assertTrue(sortAlgorithmName+" ", isSorted(list));
    }

    private boolean isSorted(List<Integer> numbers){
        Integer prev = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            Integer curr = numbers.get(i);
            if(curr < prev){
                return false;
            }
            prev = curr;
        }
        return true;
    }
}