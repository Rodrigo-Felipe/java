/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aplication.aplication2;

import Entities2.Employee;
import Entities2.OutsourceEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rodrigofelipe
 */
public class Aplication2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        List <Employee> list = new ArrayList<>();
        
        System.out.println("Enter the number of employee:");
        int n = sc.nextInt();
        
        for (int i=1; i< n; i++){
            System.out.println("Employee #" + i + "data:");
            System.out.println("Outsource (y/n)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hours: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Additional charge:");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourceEmployee (name, hours, valuePerHour, additionalCharge));
            }
            else {
                list.add(new Employee (name, hours, valuePerHour));
                
            }
            System.out.println("");
            System.out.println("PAYMENTS:");
            for (Employee emp : list){
                System.out.println(emp.getName() + " -$" + String.format("%.2f", emp.payment()));
            }
        }
        
        sc.close();
    }
}
