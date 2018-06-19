/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techdevguide;

import java.util.HashMap;
import java.util.Map;

/**
 *Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, 
 * with the value of all the strings starting with that character appended together in the order they appear in the array.
 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) → {}
 */
public class firstChar {
    public static void main(String s[]) throws Exception{
    String arrayStr[] = {"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"};
    Map<String, String> map = firstChar(arrayStr);
    System.out.println(map);
    }
    private static Map<String, String> firstChar(String[] strings) {
        
        Map map = new HashMap<>();
        
        for(String s: strings){
            if(!map.containsKey(s.substring(0, 1))){
                map.put(s.substring(0,1), s);
            } else {
                String alreadyInMap = (String) map.get(s.substring(0, 1));
                map.put(s.substring(0,1), alreadyInMap+s);
            }
        }
        return map;
    }
       
}
