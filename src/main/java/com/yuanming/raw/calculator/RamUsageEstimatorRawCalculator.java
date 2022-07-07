package com.yuanming.raw.calculator;

import org.apache.lucene.util.RamUsageEstimator;

public class RamUsageEstimatorRawCalculator implements RawCalculator {
    @Override
    public long sizeOf(Object o) {
        return RamUsageEstimator.sizeOf(o);

    }
}
