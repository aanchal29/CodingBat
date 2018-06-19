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
public class synchronizd2 extends Thread{
    String x;
    synchronizd1 u;
    
    synchronizd2(synchronizd1 a, String b){
        x=b; u=a;
    }
    
    public void run(){
 
        u.show(x);
    }
}
