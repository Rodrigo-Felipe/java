/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.lista;

/**
 *
 * @author rodrigofelipe
 */
public class Lista {

    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adicionaElementos(String elemento) {
        //o método adicionaElementos(), que recebe uma String, adiciona o elemento no índice atual e o incrementa;
        
            this.elementos[indice] = elemento;
            this.indice++;
        
    }

    public int tamanho() {
        //o método tamanho(), que devolve o tamanho total da lista;
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        //e o método pegaElemento(), que retorna um elemento com base na posição dele.
        return this.elementos[posicao];
    }
}
