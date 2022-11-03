package org.example.lec_1;

public class TypesExample {
    public static void main(String[] args) {
        /*
        byte 2^8 -> 256 -> 256 /2 -> -128 +0 +127
        short 2^16 -> -32768 + 32767
        char 2^16 -> 0 65536
        int 2^32
        long 2^64
         */

        /*
        float - min=1.4E-45 max=3.4028235E38 -> 1.4*10-45
        double - min=4.9E-324 max=1.7976931348623157E308
         */

        /*
        boolean - true / false
         */

        byte myByte = 127;
        int myInt = 128;

        char myChar = 1000;
        char mySymbolChar = 'k';
        char myCharUtf = '\u33F4';

        System.out.println(myChar);
        System.out.println(mySymbolChar);
        System.out.println(myCharUtf);
        System.out.println("㏴");

        boolean myBoolean = true;
        System.out.println(myBoolean);
    }
}
