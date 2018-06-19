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
public class synchronizdMain extends Thread{
    public static void main(String s[]) throws Exception{
       synchronizd1 c = new synchronizd1();
       
       synchronizd2 t1= new synchronizd2(c, "Thread 1");
       synchronizd2 t2= new synchronizd2(c, "Thread 2");
       synchronizd2 t3= new synchronizd2(c, "Thread 3");
       
       t1.start();
       t2.start();
       t3.start();

    }
}
