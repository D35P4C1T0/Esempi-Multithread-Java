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
public class AddMultithread implements Runnable {

    private GestCalcoli gc;
    private int pos;

    public AddMultithread(GestCalcoli gc, int pos) {
        this.gc = gc;
        this.pos = pos;
    }

    public void run() {
        gc.setRisultato(pos, gc.at(pos) * gc.at(pos));
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }

}
