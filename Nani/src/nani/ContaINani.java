/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * La classe esegue per 7 volte la stampa di un numero, per l'i-esimo nano
 * attuale.
 *
 * @author 71299951
 */
public class ContaINani extends Thread {

    public void run() {
        setName("settenani");
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + " ");
        }
    }
}
