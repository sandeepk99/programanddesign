package com.program.general;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Base64Conversion {

    public static void main(String [] args){
        //System.out.println("Generate generateBase64- "+ generateBase64(9999));
        //System.out.println("Generate getBase62From10 - "+ getBase62From10(9999));

        System.out.println("Test " + new BigDecimal("0.00"));
        //Math.random();
    }

    static String generateBase64(long number){
       char[] base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
       String hashString="";
       while(number>0){
           int index = (int) number%64;
           hashString = base64[index] + hashString;
           number = number/64;
       }

        return hashString;
    }

    public static final String getBase62From10(final long seed)
    {
        char[] corpus = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        String number = seed + "";
        char[] buf = new char[number.length()];
        int charPos = number.length() - 1;
        BigInteger bigIntegerNumber = new BigInteger(number);
        BigInteger radix = BigInteger.valueOf(62);

        while (bigIntegerNumber.compareTo(radix) >= 0)
        {
            buf[charPos--] = corpus[bigIntegerNumber.mod(radix).intValue()];
            bigIntegerNumber = bigIntegerNumber.divide(radix);
        }
        buf[charPos] = corpus[bigIntegerNumber.intValue()];
        return new String(buf, charPos, (number.length() - charPos));
    }
}
