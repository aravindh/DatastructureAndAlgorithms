package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by aravindhravindran on 14/3/18.
 */
@RunWith(value = JUnit4.class)
public class MajorityElementInArrayTest {

    MajorityElementInArray majorityElementInArray = new MajorityElementInArray();

    @Test
    public void getMajorityWithNonEmptyListWithANumberOccurringMoreThanHalfOfSizeReturnMajority(){
        Assert.assertEquals(Integer.valueOf(2), majorityElementInArray.getMajority(Arrays.asList(3,2,1,2,2,2)));
    }

    @Test
    public void getMajorityWithNonEmptyListWithANumberOccurringHalfOfSizeReturnNull(){
        Assert.assertNull(majorityElementInArray.getMajority(Arrays.asList(3,2,1,2,4,2)));
    }

    @Test
    public void getMajorityWithNonEmptyListWithAllSameNumberReturnMajority(){
        Assert.assertEquals(Integer.valueOf(2), majorityElementInArray.getMajority(Arrays.asList(2,2,2,2,2)));
    }

    @Test
    public void getMajorityWithNonEmptyListWithSingleElementReturnNull(){
        Assert.assertEquals(Integer.valueOf(2), majorityElementInArray.getMajority(Arrays.asList(2)));
    }

    @Test
    public void getMajorityWithNonEmptyListWithNoMajorityReturnNull(){
        Assert.assertNull(majorityElementInArray.getMajority(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    public void getMajorityWithEmptyListReturnNull(){
        Assert.assertNull(majorityElementInArray.getMajority(Collections.EMPTY_LIST));
    }

    //for this case we iterate second time to validate whether the candidate is majority
    @Test
    public void getMajorityWithNonEmptyListWithNoValidMajorityReturnNull(){
        Assert.assertNull(majorityElementInArray.getMajority(Arrays.asList(1,2,3,4,4)));
    }

}