package com.yuanming.raw.calculator;

import java.lang.instrument.Instrumentation;

public class InstrumentationRawCalculator implements RawCalculator{
    private Instrumentation instrumentation =  null;
    @Override
    public long sizeOf(Object o) {
        return 0l;
    }
}
