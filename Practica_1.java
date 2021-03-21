/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author Fernando Garcia
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valorSeleccion;
       Scanner seleccion = new Scanner (System.in);
       System.out.println("----Ecosistema de Dispositivos----");
       System.out.println("1. Crear dispositivo");
       System.out.println("2. Administrar dispositivo");
       System.out.println("3. Acciones con dispositivos");
       System.out.println("4. Acciones externas con dispositivos");
       System.out.println("5. Cargas masivas");
       System.out.println("6. Logs");
       System.out.println("Seleccione la opcion a ejecutar:");
       
       valorSeleccion = seleccion.nextInt();
       
       switch (valorSeleccion) {
           case 1:
               System.out.println("1. Crear dispositivo");
               crearDispositivos a = new crearDispositivos();
               a.dispositivos();
               break;
           case 2:
               System.out.println("2. Administrar dispositivo");
               Administrar_Dispositivo b = new Administrar_Dispositivo();
               b.Admi();
               break;
           case 3:
               System.out.println("3. Acciones con dispositivos");
               break;
           case 4:
               System.out.println("4. Acciones externas con dispositivos");
               break;
           case 5:
               System.out.println("5. Cargas masivas");
               cargaMasica c = new cargaMasica();
               c.leerCarga();
               break;
           case 6:
               System.out.println("6. Logs");
               
               break;
       }
       
    }
    
}
