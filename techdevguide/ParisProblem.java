/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techdevguide;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Given an array of non-empty strings, create and return a Map<String, String>
 * as follows: for each string add its first character as a key with its last
 * character as the value. pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"} 
 * pairs(["man", "moon", "good","night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class ParisProblem {

    public static void main(String s[]) throws Exception {
        String[] arrayStr = {"man", "moon", "main"};
        Map<String, String> map = pairArrayToMap(arrayStr);
        System.out.println(map);
    }

    private static Map<String, String> pairArrayToMap(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }
        return map;
    }

}
