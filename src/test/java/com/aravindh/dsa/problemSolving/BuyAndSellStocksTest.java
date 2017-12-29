package com.aravindh.dsa.problemSolving;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(value = JUnit4.class)
public class BuyAndSellStocksTest {

    BuyAndSellStocks buyAndSellStocks = new BuyAndSellStocks();

    @Test
    public void maxProfitWithInputsAsIncreasingReturnsMaxProfit(){
        Assert.assertEquals(8, buyAndSellStocks.maxProfitMultipleTransaction(Arrays.asList(1,3,5,7,9)));
    }

    @Test
    public void maxProfitWithInputsAsDecreasingReturnsMaxProfit(){
        Assert.assertEquals(0, buyAndSellStocks.maxProfitMultipleTransaction(Arrays.asList(9,7,5,3,2,1)));
    }

    @Test
    public void maxProfitWithInputsAsConstantPriceReturnsMaxProfit(){
        Assert.assertEquals(0, buyAndSellStocks.maxProfitMultipleTransaction(Arrays.asList(3,3,3,3,3)));
    }

    @Test
    public void maxProfitWithInputsWithTwoMaximumsReturnsMaxProfit(){
        Assert.assertEquals(17, buyAndSellStocks.maxProfitMultipleTransaction(Arrays.asList(1,3,5,7,4,8,15,2)));
    }

    @Test
    public void maxProfitWithInputsWithAlternatingPeaksReturnsMaxProfit(){
        Assert.assertEquals(10, buyAndSellStocks.maxProfitMultipleTransaction(Arrays.asList(1,3,2,5,6,4,8,7)));
    }

    @Test
    public void maxProfitOneTransactionWithInputsAsIncreasingReturnsMaxProfit(){
        Assert.assertEquals(8, buyAndSellStocks.maxProfitOneTransaction(Arrays.asList(1,3,5,7,9)));
    }

    @Test
    public void maxProfitOneTransactionWithInputsAsDecreasingReturnsMaxProfit(){
        Assert.assertEquals(0, buyAndSellStocks.maxProfitOneTransaction(Arrays.asList(9,7,5,3,2,1)));
    }

    @Test
    public void maxProfitOneTransactionWithInputsAsConstantPriceReturnsMaxProfit(){
        Assert.assertEquals(0, buyAndSellStocks.maxProfitOneTransaction(Arrays.asList(3,3,3,3,3)));
    }

    @Test
    public void maxProfitOneTransactionWithInputsWithTwoMaximumsReturnsMaxProfit(){
        Assert.assertEquals(14, buyAndSellStocks.maxProfitOneTransaction(Arrays.asList(1,3,5,7,4,8,15,2)));
    }

    @Test
    public void maxProfitOneTransactionWithInputsWithAlternatingPeaksReturnsMaxProfit(){
        Assert.assertEquals(7, buyAndSellStocks.maxProfitOneTransaction(Arrays.asList(1,3,2,5,6,4,8,7)));
    }
}