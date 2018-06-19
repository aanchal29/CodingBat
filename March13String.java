/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asharma
 */
public class March13String {
    static StringBuffer st = new StringBuffer("");
  public static void main(String args[]){
      System.out.println(stringSplosion("Code"));
  }  
  
    public static String stringSplosion(String str) {
        char p[] = str.toCharArray();
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j <= i; j++) {
                st.append(p[j]);
                //System.out.print(p[j]);
            }
        }
        
     return String.valueOf(st);  
    }

}
