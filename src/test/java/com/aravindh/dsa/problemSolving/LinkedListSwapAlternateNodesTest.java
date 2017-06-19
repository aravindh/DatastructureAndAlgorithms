package com.aravindh.dsa.problemSolving;

import com.aravindh.dsa.helper.LinkedListCreationHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 19/6/17.
 */
@RunWith(value = JUnit4.class)
public class LinkedListSwapAlternateNodesTest {

    @Test
    public void swapAlternateNodesWithEvenNumberOfNodesInListModifiesList(){
        LinkedListSwapAlternateNodes list = new LinkedListSwapAlternateNodes();
        LinkedListCreationHelper.getLinkedListWithValues(list, 1,2,3,4);
        list.swapAlternateNodes();
    }

    @Test
    public void swapAlternateNodesWithOddNumberOfNodesInListModifiesList(){
        LinkedListSwapAlternateNodes list = new LinkedListSwapAlternateNodes();
        LinkedListCreationHelper.getLinkedListWithValues(list, 1,2,3);
        list.swapAlternateNodes();
    }

    @Test
    public void swapAlternateNodesWithEmptyListModifiesList(){
        LinkedListSwapAlternateNodes list = new LinkedListSwapAlternateNodes();
        list.swapAlternateNodes();
    }

}