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
public class synchronizd1 {
    
    synchronized void show(String s){
        try{
        System.out.println("*********** Starts "+s+" ***********");
        //Thread.sleep(200);
        System.out.println("########### Ends "+s+" ###########");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
