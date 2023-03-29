/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication.alurathreads_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class TarefaBuscaNome implements Runnable {

    private String nomeArquivo;
    private String nome;

    public TarefaBuscaNome(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));

            int numeroLinha = 1;

            while (scanner.hasNextLine()) {

                String linha = scanner.nextLine();

                if (linha.contains(nome)) {
                    System.out.println(nomeArquivo + " - " + numeroLinha
                            + " - " + linha);
                } else {
                }

                numeroLinha++;

            }

            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

    
