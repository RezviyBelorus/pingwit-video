package org.example.lec_1;

public class WrapperExample {
    public static void main(String[] args) {
        int myInt = 100;
        Integer myInteger = 100;

        Integer sum = myInt + myInteger;

        System.out.println(sum);

        /*
        long -> Long
        byte -> Byte
        double -> Double
        float -> Float
        char -> Character
         */

        String name = "Egorka";
        String surname = "Petrovich";
        String fullName = name + " " + surname;

        System.out.println(fullName);
    }
}
