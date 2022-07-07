package com.yuanming.raw;

import com.yuanming.raw.calculator.*;
import com.yuanming.raw.util.MockUtil;

public class Main {
    public static void main(String[] args) {

        GraphLayoutRawCalculator graphLayoutRawCalculator = new GraphLayoutRawCalculator();
        RamUsageEstimatorRawCalculator ramUsageEstimatorRawCalculator = new RamUsageEstimatorRawCalculator();
        ObjectSizeRawCalculator objectSizeRawCalculator = new ObjectSizeRawCalculator();
        JavaSizeOfRawCalculator javaSizeOfRawCalculator = new JavaSizeOfRawCalculator();
        EhcacheRawCalculator ehcacheRawCalculator = new EhcacheRawCalculator();


        testCalculator(graphLayoutRawCalculator);
        testCalculator(ramUsageEstimatorRawCalculator);
        testCalculator(objectSizeRawCalculator);
        testCalculator(javaSizeOfRawCalculator);
        testCalculator(ehcacheRawCalculator);



        testPerformance(graphLayoutRawCalculator);
        testPerformance(ramUsageEstimatorRawCalculator);
        testPerformance(objectSizeRawCalculator);
        testPerformance(javaSizeOfRawCalculator);
        testPerformance(ehcacheRawCalculator);


    }


    public static void testCalculator(RawCalculator rawCalculator) {
        System.out.println("\n");
        System.out.println(rawCalculator.getClass());

        System.out.print("Long size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockLong()));

        System.out.print("Integer size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockInteger()));

        System.out.print("Short size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockShort()));

        System.out.print("Float size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockFloat()));

        System.out.print("Double size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockDouble()));

        System.out.print("Boolean size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockBoolean()));

        System.out.print("String size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockString()));

        System.out.print("Empty object size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockObject()));

        System.out.print("Empty list size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockEmptyList()));

        System.out.print("List size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockList()));

        System.out.print("Object size: ");
        System.out.println(rawCalculator.sizeOf(MockUtil.mockObjectWithList()));
    }


    public static void testPerformance(RawCalculator rawCalculator) {
        System.out.println("\n");
        System.out.println(rawCalculator.getClass());
        MockUtil.TestObject testObject = MockUtil.mockObjectWithList();
        long start = System.nanoTime();
        int times = 10_000;
        for (int i = 0; i < times; i++) {
            rawCalculator.sizeOf(testObject);
        }
        long end = System.nanoTime();
        System.out.print("Coast ns per calculate " + (end - start) / times);
    }
}
