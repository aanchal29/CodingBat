/*
 * 
 * Loop over the given array of strings to build a result string like this: 
 * when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. 
 * Return the empty string if no string appears a 2nd time.
 * 
 * wordAppend(["a", "b", "a"]) → "a"
 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
 * wordAppend(["a", "", "a"]) → "a"
 */
package techdevguide;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author asharma
 */
public class wordAppend {
    public static String WordAppend(String[] strings) {
        String result="";
        Map<String, Integer> map=new HashMap<String, Integer>();

        for (String currentString:strings) {
            int i=0;
            if (map.containsKey(currentString)) {
                i=map.get(currentString)+1;
                map.put(currentString, i);
                if (i%2==0) {
                    result=result+currentString;
                }
            } else {
                map.put(currentString, i+1);
            }

        }
        
        System.out.println(map);

        return result;
    }

    public static void main(String[] args) {
        String arrString[] ={"a", "b", "a","c", "a", "d", "a"};
        System.out.println(WordAppend(arrString));

    }
}
