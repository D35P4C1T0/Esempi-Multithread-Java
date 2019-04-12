/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DinDonDan;

/**
 *
 * @author 71299951
 */
public class Campana implements Runnable {

    String suono;
    int volte;

    /**
     * La classe ha un suono e un numero di volte che rappresenta il numero di
     * rintocchi.
     *
     * @param suono
     * @param volte
     */
    public Campana(String suono, int volte) {
        this.suono = suono;
        this.volte = volte;
    }

    public void run() {
        for (int k = 0; k < volte; k++) {
            System.out.println((k + 1) + suono + " ");
        }
    }
}
