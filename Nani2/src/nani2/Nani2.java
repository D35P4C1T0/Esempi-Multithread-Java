/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani2;

/**
 *
 * @author 71299951
 */
public class Nani2 {

    /**
     * Si creano 7 thread e si contano i nani.
     *
     * @param args
     */
    public static void main(String[] args) {

        Thread[] thr = new ContaINani2[7];
        String[] nomi = {"Andrea", "tombolo", "osvaldo", "eccolo", "mestolo", "embolo", "ciondolo"};

        for (int i = 0; i < 7; i++) {
            thr[i] = new ContaINani2(nomi[i]);
            thr[i].start();
        }
    }
}
