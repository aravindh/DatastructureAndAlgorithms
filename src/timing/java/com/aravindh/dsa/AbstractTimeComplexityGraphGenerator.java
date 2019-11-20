package com.aravindh.dsa;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public abstract class AbstractTimeComplexityGraphGenerator {

    private List<BigInteger> xAxisSamples;
    private List<Long> yAxisSamples;
    private final BigInteger MIN_SIZE = BigInteger.TEN;
    private final BigInteger MAX_SIZE = BigInteger.valueOf(1000000l);
    private final Integer SAMPLING_RATE = Integer.valueOf(10);

    public int inputSampleGenerator(){
        return 0;
    }

    public abstract void doAction();

    public void graphGenerator(){

    }


}
