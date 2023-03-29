/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lista;

/**
 *
 * @author rodrigofelipe
 */
public class TarefaAdicionarElemento implements Runnable {
    
    private Lista lista;
    private final int numeroDoThread;

    public TarefaAdicionarElemento(Lista lista, int numeroDoThread) {
        this.lista = lista;
        this.numeroDoThread = numeroDoThread;
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        for (int i = 0; i < 100; i++) {
            lista.adicionaElementos("Thread" + " - "+ i);
            
        }
        
    }
    
    
}
