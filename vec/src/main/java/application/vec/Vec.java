/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package application.vec;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class Vec {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o tamanho do vetor:");
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGTH: %2f%n", avg);
        sc.close();

    }
}
