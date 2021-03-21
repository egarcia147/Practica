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
public class Administrar_Dispositivo {

    public void Admi() {
        int valorSeleccion;
        Scanner seleccion = new java.util.Scanner(System.in);
        System.out.println("----Administrar Dispositivos----");
        System.out.println("1. Computadora Portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. SmartPhone");
        System.out.println("5. Auriculares Inalambricosd");
        System.out.println("6. Seleccione el tipo de despositivos a crear:");
        valorSeleccion = seleccion.nextInt();
        switch (valorSeleccion) {
            case 1:
                System.out.println("Computadora Portatil");
                System.out.println("Computador_portatil_2");
                System.out.println("Computador_portatil_5");
                System.out.println("Computador_portatil_3");
                System.out.println("Computador_portatil_4");

                break;

            case 2:
                System.out.println("Tablet");
                System.out.println("Tablet_P0");
                System.out.println("Tablet_P1");
                System.out.println("Tablet_P2");
                System.out.println("Tablet_P3");
                break;

            case 3:
                System.out.println("SmartWatch");
                System.out.println("SmartWatch_P0");
                System.out.println("SmartWatch_P1");
                System.out.println("SmartWatch_P2");
                System.out.println("SmartWatch_P3");
                break;
            case 4:
                System.out.println("Smartphone");
                System.out.println("Smartphone_P0");
                System.out.println("TSmartphone_P1");
                System.out.println("Smartphone_P2");
                System.out.println("Smartphone_P3");
                break;

        }
    }
}
