/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.com.tiquetac.tiquetac;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodrigofelipe
 */
public class TiqueTac {

    boolean tique;

    synchronized void tique(boolean estaExecutando);
    if (!estaExecuntando){
        tique = true;
        notify();
        return;
    }

    System.out.println ("Tique");
        tique  = true;

    notify();

    
        try{
        while (tique) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(TiqueTac.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
