/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lista;

/**
 *
 * @author rodrigofelipe
 */
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        
        Lista lista = new Lista ();
        
        for (int i = 0; i < 100; i++) {
            
            new Thread (new TarefaAdicionarElemento(lista,i)).start();
            
        }
        Thread.sleep (2000);
        
        for (int i = 0; i <lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
            
        }
    }
    
}
