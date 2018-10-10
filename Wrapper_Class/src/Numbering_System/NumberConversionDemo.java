package Numbering_System;

public class NumberConversionDemo {

    public static void main(String[] args) {
        //Binary to Decimal;
        String binary = "1011011";
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal is = " + decimal);
        //Octal to Decimal;
        String octal = "6554";
        decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal is = " + decimal);

        //Hexadecimal to Decimal;
        String hexaDecimal = "12d";
        decimal = Integer.parseInt(hexaDecimal, 16);
        System.out.println("Decimal is = " + decimal);

    }

}
