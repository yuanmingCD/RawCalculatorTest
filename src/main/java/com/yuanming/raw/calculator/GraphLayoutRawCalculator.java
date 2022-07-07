package com.yuanming.raw.calculator;

import org.openjdk.jol.info.GraphLayout;

public class GraphLayoutRawCalculator implements RawCalculator {
    @Override
    public long sizeOf(Object o) {
        return GraphLayout.parseInstance(o).totalSize();
    }
}
