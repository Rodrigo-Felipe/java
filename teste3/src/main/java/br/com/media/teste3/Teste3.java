/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.media.teste3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class Teste3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int idade = 0;
        int soma = 0;
        int cont = 0;

        System.out.print("Digite um número: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            soma = soma + idade;
            cont++;
            System.out.print("Digite um número: ");
            idade = sc.nextInt();

        }

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.printf("A média da idades é: %.2f%n", media);
        } else {
            System.out.println("Impossível calcular");
        }
    }
}
