/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadcalcolitoghether;

/**
 *
 * @author matteo @ thiccpad
 */
public class GestCalcoli {

    private double d;
    private int[] valori = new int[10];

    public double getRisultato() {
        return d;
    }

    public void setRisultato(int pos, int d) {
        valori[pos] = d;
    }

    public int[] getValori() {
        return valori;
    }

    public void fillValori() {
        for (int i = 0; i < 10; i++) {
            this.valori[i] = i;
        }
    }

    public void fillValori(int[] valori) {
        this.valori = valori;
    }

    public Integer at(int i) {
        if (i < 0 || i > 10) {
            return null;
        }
        return valori[i];
    }
}
