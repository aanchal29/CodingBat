/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uber;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asharma
 */
public class digitToLiteralRepresentation {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final int HUNDRED = 100;
    
    private static final Map TEN_MULTIPLES = new HashMap<Integer, String>() {{
        put(2, "Twenty");
        put(3, "Thirty");
        put(4, "Forty");
        put(5, "Fifty");
        put(6, "Sixty");
        put(7, "Seventy");
        put(8, "Eighty");
        put(9, "Ninety");
    }};
    
    
   static Map<Integer, String>  ONE_TO_NINETEEN = new HashMap<Integer, String>() {{
        put(1, "One");
        put(2, "Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");

        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
    }};

   public static String numberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        System.out.println("current"+number);
        int current = number;
        StringBuffer buffer = new StringBuffer();

        while (current > 0) {
            if (current >= BILLION) {
                buffer.append(numberToWords(current / BILLION));
                buffer.append(" Billion");
                current %= BILLION;
                
            } else if (current >= MILLION) {
                buffer.append(numberToWords(current / MILLION));
                buffer.append(" Million");
                current %= MILLION;
            } else if (current >= THOUSAND) {
                buffer.append(numberToWords(current / THOUSAND));
                buffer.append(" Thousand");
                current %= THOUSAND;
            } else if (current >= HUNDRED) {
                buffer.append(numberToWords(current / HUNDRED));
                buffer.append(" Hundred");
                current %= HUNDRED;
            } else if (current >= 20) {
                buffer.append(TEN_MULTIPLES.get(current / 10));
                current %= 10;
            } else {
                buffer.append(ONE_TO_NINETEEN.get(current));
                current = 0;
            }

            if (current > 0) {
                buffer.append(" ");
            }
        }

        return buffer.toString();
    }
   
       
public static void main(String args[]) {
    System.out.println(numberToWords(2000001234)); 

}

}