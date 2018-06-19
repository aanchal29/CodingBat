/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asharma
 */
public class enhancedForLoop {
    public static void main(String args[]){
        String s[]= {"Annie", "Ronie", "Jerry", "John", "Tony"};
        
        //Enhanced For Loop
        for (String s1: s){
            System.out.println(s1);
        }
        
        System.out.print("\n");
        
        //Regular For Loop
        for(int i=0; i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
