/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author asharma
 */
public class demo extends Thread{
    String x;
    
    demo(String p){
        x=p;
    }
    
    public void run(){
        try{
        for (int i = 0; i < 10; i++){
            System.out.print(x +" - "+ i + "\t");
            sleep(200);
        }
    }
    catch(Exception x){
    }
    }
}
