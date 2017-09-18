package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(value = JUnit4.class)
public class SortLinkedListByActualValuesTest {

    @Test
    public void sortWithNoNegativeValues() {
        SortLinkedListByActualValues sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, 1, 2, 3);
        sort.sort();
        Assert.assertEquals("1, 2, 3, ", sort.toString());
    }

    @Test
    public void sortWithNegativeValuesInEnd() {
        SortLinkedListByActualValues sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, 1, 2, 3, -4, -5);
        sort.sort();
        Assert.assertEquals("-5, -4, 1, 2, 3, ", sort.toString());
    }

    @Test
    public void sortWithAlternatingPositiveAndNegativeValuesReturnsSortedList() {
        SortLinkedListByActualValues sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, 1, -2, 3, -4, 5);
        sort.sort();
        Assert.assertEquals("-4, -2, 1, 3, 5, ", sort.toString());
        sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, -1, 2, -3, 4, -5);
        sort.sort();
        Assert.assertEquals("-5, -3, -1, 2, 4, ", sort.toString());
    }

    @Test
    public void sortWithNegativeValuesAtStartReturnUnModified() {
        SortLinkedListByActualValues sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, -1, 2, 3);
        sort.sort();
        Assert.assertEquals("-1, 2, 3, ", sort.toString());
    }

    @Test
    public void sortWithAllNegativeValuesReturnReversedList() {
        SortLinkedListByActualValues sort = new SortLinkedListByActualValues();
        LinkedListCreationHelper.getLinkedListWithValues(sort, -1, -2, -3);
        sort.sort();
        Assert.assertEquals("-3, -2, -1, ", sort.toString());
    }

}