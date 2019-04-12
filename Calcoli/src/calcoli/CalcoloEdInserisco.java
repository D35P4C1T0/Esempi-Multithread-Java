/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoli;

/**
 *
 * @author 71299951
 */
public class CalcoloEdInserisco implements Runnable {

    private double B;
    private GestCalcoli gc;

    /**
     * La classe implementa la classe che ospita i calcoli e contiene un valore
     * double a cui viene sommato il risultato ottenuto dal gestore dei calcoli.
     *
     * @param b
     * @param gc
     */
    public CalcoloEdInserisco(double b, GestCalcoli gc) {
        B = b;
        this.gc = gc;
    }

    public void run() {
        gc.setRisultato(gc.getRisultato() + B);
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }
}
