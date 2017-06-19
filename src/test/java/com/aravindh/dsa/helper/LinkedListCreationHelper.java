package com.aravindh.dsa.helper;

import com.aravindh.dsa.linear.LinkedList;

/**
 * Created by aravindhravindran on 19/6/17.
 */
public class LinkedListCreationHelper {

    public static LinkedList getLinkedListWithValues(int... values){
        LinkedList list = new LinkedList();
        populateValues(list, values);
        return list;
    }

    private static void populateValues(LinkedList list, int ... values){
        for(int value : values){
            list.append(value);
        }
    }

    public static void getLinkedListWithValues(LinkedList list, int ... values){
        populateValues(list, values);
    }

}
