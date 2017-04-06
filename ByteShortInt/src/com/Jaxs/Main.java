package com.Jaxs;

public class Main {

    public static void main(String[] args) {

        // int has a with of 32
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_14_748_364;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a with of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a with of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("myNewShortValue = " + myNewByteValue);

        // long has a with of 64
        long myLongValue = -9_223_372_036_854_775_807L;
        long myNewLongValue = (long) myLongValue / 2 ;
        System.out.println("myNewLongValue = " + myNewByteValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L +10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
