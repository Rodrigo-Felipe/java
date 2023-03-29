/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.mediaidade.mediaidade;

import java.util.Locale;
import java.util.Scanner;



/**
 *
 * @author rodrigofelipe
 */
public class Mediaidade {

    public static void main(String[] args) {
        
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        int soma = 0;
        int cont = 0;
        
        System.out.println("Digite um número:");
        
        while (idade >= 0) {   
            soma = soma + idade;
            cont = cont++;
            idade = sc.nextInt();
        }
            
        if (cont > 0) {
            double media = (double) soma/cont;
            System.out.printf("%.2f%n", media);
        }
        else  
            System.out.println("Impossível calcular");
    }
}
