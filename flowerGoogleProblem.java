/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asharma
 */
public class flowerGoogleProblem {
    class Solution {
    int i;
    public int solution(int[] P, int K) {
        int[] d =  new int[P.length];
        for( i=0; i<P.length; i++)d[P[i] - 1] = i + 1;
        int L = 0, R = K + 1, out = Integer.MAX_VALUE;
        for( i = 0; R < d.length; i++){
            if(d[i] < d[L] || d[i] <= d[R]){
                if(i == R)out = Math.min(out, Math.max(d[L], d[R]));
                L = i; 
                R = K + 1 + i;
            }
        }
        return (out == Integer.MAX_VALUE)?-1:out;
    }
}
}
