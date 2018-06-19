/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Warmup2;

/**
 *
 * @author asharma
 */
public class stringBits {

    public static String stringBits(String str) {

        StringBuilder b = new StringBuilder();
        char x[] = str.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                b.append(x[i]);
            }
        }
        return b.toString();
    }
    
    public static void main(String args[]) {
        System.out.println(stringBits("HiHiHi"));
    }

}
