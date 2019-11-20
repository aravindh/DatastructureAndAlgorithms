package com.aravindh.dsa.problemSolving;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 8/6/17.
 */
@RunWith(value=JUnit4.class)
public class HistogramLargestAreaTest {

    @Test
    public void largest(){
        HistogramLargestArea area = new HistogramLargestArea();
        System.out.println(area.largestRectangleArea(Arrays.asList(2,1,5,6,2,3)));
    }
}