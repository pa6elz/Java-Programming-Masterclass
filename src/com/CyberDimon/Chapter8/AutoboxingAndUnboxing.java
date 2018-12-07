package com.CyberDimon.Chapter8;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Dima");

        // Long way (create new Integer class ... )

        //ArrayList<Int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(32);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

//        for(int i=0; i<10; i++) {
//            System.out.println(i + " -> " + intArrayList.get(i).intValue());
//        }

        // Modern concept

        Integer myIntValue = 56; // Integer.valueOf(56);
        int mySimpleInt = myIntValue; // myIntValue.intValue();
        //Double myDoubleValue = 43.123;

        ArrayList<Double> myDoubleList = new ArrayList<Double>();
        for(double dbl=0.0; dbl < 10; dbl+=0.5) {
            myDoubleList.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleList.size(); i++) {
            double value = myDoubleList.get(i).doubleValue();
            System.out.println(i + " -> " + value);
        }


    }
}
