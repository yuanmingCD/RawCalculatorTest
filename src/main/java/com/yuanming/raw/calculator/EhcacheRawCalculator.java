package com.yuanming.raw.calculator;

import org.ehcache.sizeof.SizeOf;
import org.ehcache.sizeof.impl.UnsafeSizeOf;

//https://github.com/ehcache/sizeof
public class EhcacheRawCalculator implements RawCalculator{


   final SizeOf sizeOf = UnsafeSizeOf.newInstance();
    @Override
    public long sizeOf(Object o) {
        return sizeOf.deepSizeOf(o);
    }
}
