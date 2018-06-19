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
public class runable implements Runnable {

    Thread p;
    String x;
    
    runable(String q){
        x=q;
        p = new Thread(this);
    }
    
    @Override
    public void run() {
    System.out.println("Hello");   

    }
    
}

