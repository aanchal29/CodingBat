
import java.util.*;

public class GoogleLicenseString {
  public static void main(String args[]){
      
      String s = "2-4A0r7-4k";
      String string = new String (s.replace("-", ""));
      
      StringBuffer sb = new StringBuffer();
      
      int K = 2,counter =0;
      
      
      for(int i = string.length() -1 ; i>=0; i--){
          sb.append(Character.toUpperCase(string.charAt(i)));
          counter ++;
          
          if((counter == K) && (i!=0)){
              sb.append("-");
              counter =0;
      }
      }
      
      System.out.println(sb.toString());
  }  
  
}
