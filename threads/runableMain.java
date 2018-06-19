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
public class runableMain {
    public static void main(String s[]) throws Exception{
        runable t = new runable("A");
        t.p.start();
        System.out.print(t.p.getName());
    }
}

