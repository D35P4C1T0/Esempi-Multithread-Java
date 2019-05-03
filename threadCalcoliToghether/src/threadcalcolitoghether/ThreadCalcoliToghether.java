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
public class ThreadCalcoliToghether {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestCalcoli GC = new GestCalcoli();
        //GC.setRisultato(0);
        System.out.println(GC.getRisultato());

        GC.fillValori();

        for (int i = 0; i < 10; i++) {
            new Thread(new AddMultithread(GC, i)).start();
        }

        while (Thread.activeCount() > 1) {
            System.out.println(Thread.activeCount());
        }

        System.out.println("concluso");
        System.out.println(Thread.activeCount());
        //System.out.println("risultato finale: " + GC.getValori());
        for (int i = 0; i < GC.getValori().length; i++) {
            System.out.println(GC.at(i));
        }
    }

}
