/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani2;

/**
 * Per 7 volte
 *
 * @author 71299951
 */
public class ContaINani2 extends Thread {

    /**
     * Viene dato un nome al thread-nano. Per 7 vole vengono poi stampati i nomi
     * dei nani.
     *
     * @param nome
     */
    public ContaINani2(String nome) {
        super();
        setName(nome);
    }

    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + " " + getName());
        }
    }
}
