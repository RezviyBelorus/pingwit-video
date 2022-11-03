package org.example.lec_1;

public class TypesCastingExample {

    public static void main(String[] args) {
        // повышение
        byte myByte = 127;
        int myInt = myByte;

        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);

        float myFloat =myInt;
        System.out.println(myFloat);

        // понижение
        int highInt = 400;
        byte highByte = (byte) highInt;
        System.out.println(highByte); // 400 - 256 -> -112

        double highDouble = 100.9;
        highInt = (int) highDouble;

        System.out.println(highInt);
    }
}
