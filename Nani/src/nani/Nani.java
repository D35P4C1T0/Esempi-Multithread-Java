/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * La classe lancia un thread che conta i nani.
 *
 * @author 71299951
 */
public class Nani {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ContaINani thr1 = new ContaINani();
        thr1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
