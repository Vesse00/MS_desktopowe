/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.home.local.adams.listazakupow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gromm
 */
public class IleKupionych {
    
    private String file_name = "lista_zakopow.csv";
    
    
    public void ileProdotkow(){    
        int liczba = 0;
        try {
            Scanner sc= new Scanner(new File(file_name));
            while(sc.hasNextLine()){
                liczba++;
                
                
            }
            System.out.println("Ile: "+liczba);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListaZakupow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
