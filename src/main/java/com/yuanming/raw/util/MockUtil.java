package com.yuanming.raw.util;

import java.util.*;

public class MockUtil {


    public static Long mockLong() {
        return new Long(1000l);
    }

    public static Integer mockInteger() {
        return new Integer(1000);
    }

    public static Short mockShort() {
        return new Short((short) 100);
    }

    public static Float mockFloat() {
        return new Float(1000.0f);
    }

    public static Double mockDouble() {
        return new Double(1000.00d);
    }

    public static Boolean mockBoolean() {
        return new Boolean(false);
    }

    public static String mockString() {
        return new String("1000");
    }


    public static Object mockObject() {
        return new Object();
    }


    public static List<String> mockEmptyList() {
        return new ArrayList<>();
    }

    public static List<Integer> mockList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Integer(i));
        }
        return list;
    }

    public static TestObject mockObjectWithList() {
        TestObject testObject = new TestObject();
        testObject.setList(mockList());
        return testObject;
    }


    public static class TestObject {
        List<Integer> list;

        public List<Integer> getList() {
            return list;
        }

        public void setList(List<Integer> list) {
            this.list = list;
        }
    }


}
