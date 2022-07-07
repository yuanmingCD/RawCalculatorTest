package com.yuanming.raw.calculator;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

public class ObjectSizeRawCalculator implements RawCalculator{
    final ObjectSizeCalculator osc = new ObjectSizeCalculator(ObjectSizeCalculator.getEffectiveMemoryLayoutSpecification());

    @Override
    public long sizeOf(Object o) {
        return osc.calculateObjectSize(o);
    }
}
