package com.yuanming.raw.calculator;


import com.carrotsearch.sizeof.RamUsageEstimator;

public class JavaSizeOfRawCalculator implements RawCalculator{
    @Override
    public long sizeOf(Object o) {
        return RamUsageEstimator.sizeOf(o);
    }
}
