/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author rodrigofelipe
 */
public class Area {

    public double a;
    public double b;
    public double c;
    
    public double calculo (){
        double p = (a + b+ c)/(2.0);
        return Math.sqrt(p* (p - a) * (p - b) * (p -c));
}
}
