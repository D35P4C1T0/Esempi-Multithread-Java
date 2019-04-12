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
public class DinDonDan {

    /**
     * @param args the command line arguments
     *
     * Vengono create campane con un suono caratteristico e ogni campana viene
     * "suonata" ad un thread che la esegue.
     *
     */
    public static void main(String[] args) {
        Runnable cam1 = new Campana("din", 5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread thr2 = new Thread(new Campana("don", 5));
        thr2.start();
        new Thread(new Campana("dan", 5)).start();
    }

}
