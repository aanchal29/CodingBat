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
public class demoMain {
    public static void main(String s[]) throws Exception{
        demo t1 = new demo("A");
        demo t2= new demo(" \n B");
        
//        t1.start();
//        t2.start();
//        
//        t1.join();
//        t2.join();
//        
//        System.out.println("t1: "+t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(Thread.currentThread());
        
        t1.setPriority(2);
        t2.setPriority(7);
        
        t1.start();
        t2.start();
        System.out.println("\n Bye");
        
        if(t1.isDaemon())
            System.out.print("isDaemon");
        
    }
}
