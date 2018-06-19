/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techdevguide;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a
 * key for each different string, with the value the number of times that string appears in the array.
 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class wordCount {
    public static void main(String s[]) throws Exception{
    String arrayStr[] = {"apple", "banana", "apple", "apple", "tea", "coffee", "banana"};
    Map<String, Integer> map = pairArrayToMap(arrayStr);
    System.out.println(map);
    }
    private static Map<String, Integer> pairArrayToMap(String[] strings) {
        int count=0;
        Map map = new HashMap<>();
        for (String s:strings) {
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else{
                count =(int) map.get(s);
                map.put(s, count +1 );
            }
        }
        return map;
    }
        
}
