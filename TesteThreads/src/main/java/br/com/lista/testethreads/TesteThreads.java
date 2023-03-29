/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.lista.testethreads;

import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class TesteThreads {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        x = 0;
        System.out.print("Digite um numero: ");
        x = sc.nextInt();
        sc.nextLine();

        while (x < 10) {
            System.out.print("Digite um numero: ");
           
        }
        sc.close();
    }
}
