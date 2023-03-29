/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplication.alurathreads_2;

/**
 *
 * @author rodrigofelipe
 */
public class Alurathreads_2 {

    public static void main(String[] args) {

        String nomeProcurado = "Dan";

        Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt",
                nomeProcurado));
        Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome(
                "assinaturas1.txt", nomeProcurado));
        Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome(
                "assinaturas2.txt", nomeProcurado));

        threadAutores.start();
        threadAssinaturas1.start();
        threadAssinaturas2.start();
    }
}
