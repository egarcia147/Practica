/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fernando Garcia
 */
public class cargaMasica {
    public void leerCarga(){ 
    try {
        FileReader entrada=new FileReader("C:/Users/FernandoGarcia/Desktop/trasladoBodegas.txt");
        
        int c=entrada.read();
        
        while(c != -1){
        
            c=entrada.read();
            
            char letra=(char )c;
            
            System.out.print(letra );
    }
        System.out.println(" \n");
       
    } catch (IOException  e) {
        System.out.println(" No se ha encontrado el archivo");   
    } //catch
}//leerCarga
    
}
