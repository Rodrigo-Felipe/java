/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testes;

import entities.Area;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class Testes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Area x,y;
        
        x = new Area();
        y = new Area();
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
      
      double calculoX = x.calculo();
      double calculoY = y.calculo();
      
       
     
        System.out.printf("Triangle X area: %.4f%n", calculoX);
        System.out.printf("Triangle Y area: %.4f%n", calculoY);
        if (calculoX > calculoY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();

    }
}
