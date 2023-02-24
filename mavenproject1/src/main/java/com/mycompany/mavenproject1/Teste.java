/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author rodrigofelipe
 */
public class Teste {
    
    public static void main(String[] args) {
        
    

    Conta minhaConta = new Conta();
    minhaConta.saldo  = 500.0;
    Conta outraConta = minhaConta;
    outraConta.saldo

    += 1000.0;
    System.out.println (minhaConta.saldo);
    }
}
