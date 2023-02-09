/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        /*double x = 3.0;
double y = 4.0;
double z = -5.0;
double A, B, C;
A = Math.sqrt(x);
B = Math.sqrt(y);
C = Math.sqrt(25.0);
System.out.println("Raiz quadrada de " + x + " = " + A);
System.out.println("Raiz quadrada de " + y + " = " + B);
System.out.println("Raiz quadrada de 25 = " + C);
A = Math.pow(x, y);
B = Math.pow(x, 2.0);
C = Math.pow(5.0, 2.0);
System.out.println(x + " elevado a " + y + " = " + A);
System.out.println(x + " elevado ao quadrado = " + B);
System.out.println("5 elevado ao quadrado = " + C);
A = Math.abs(y);
B = Math.abs(z);
System.out.println("Valor absoluto de " + y + " = " + A);
System.out.println("Valor absoluto de " + z + " = " + B);
         */
 /* Date relogio = new Date(); // DATA
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());

        Locale Idioma = Locale.getDefault();
        System.out.println("A máquina está no idioma: ");
        System.out.println(Idioma);

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        int largura = (int) size.getWidth();

        int altura = (int) size.getHeight();

        System.out.println("Sua resolução é de:" + " " + largura + " X " + altura);
         */
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        while (x != 0) {
            x = sc.nextInt();
        }
        sc.close();

    }
}
