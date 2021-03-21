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
public class crearDispositivos {
    String correoElectronico;
    String nombreDispositivo;
    String visible;
      public void dispositivos(){
      
      int valorSeleccion;
      String dato;
      String si="SI";
      String no="NO";
      String correoElectronico;
      String nombreDispositivo;
      String visibleParaConexion;
      Scanner seleccion = new Scanner (System.in);
      System.out.println("----Crear Dispositivos----");
       System.out.println("1. Computadora Portatil");
       System.out.println("2. Tablet");
       System.out.println("3. SmartWatch");
       System.out.println("4. SmartPhone");
       System.out.println("5. Auriculares Inalambricosd");
       System.out.println("6. Seleccione el tipo de despositivos a crear:");
       
       valorSeleccion = seleccion.nextInt();
       
       Scanner valorDatos = new Scanner (System.in);
       switch (valorSeleccion) {
           case 1:
               System.out.println("Computadora Portatil");
               System.out.println("Ingrese Correo Electronico");
               dato = valorDatos.next();
               correoElectronico = dato;
               System.out.println("Ingrese Nombre Dispositivo");
               dato = valorDatos.next();
               nombreDispositivo = dato;
               System.out.println("visible para conexion");
               System.out.println("SI     NO");
               dato = valorDatos.next();
               visibleParaConexion = dato;
               System.out.println("-------------------------------------------");
               System.out.println("CREACION DE NUEVA COMPUTADORA PORTATIL");
               System.out.println("Correo Electronico: " + correoElectronico);
               System.out.println("Nombre del dispositivo: " + nombreDispositivo);
               System.out.println("Visible para conexion: " + visibleParaConexion);
               System.out.println("Nota: el dispositivo sera encendido por defecto");
               break;
               
                case 2:
               System.out.println("Tablet");
               System.out.println("Ingrese Correo Electronico");
               dato = valorDatos.next();
               correoElectronico = dato;
               System.out.println("Ingrese Nombre Dispositivo");
               dato = valorDatos.next();
               nombreDispositivo = dato;
               System.out.println("visible para conexion");
               System.out.println("SI     NO");
               dato = valorDatos.next();
               visibleParaConexion = dato;
               System.out.println("-------------------------------------------");
               System.out.println("CREACION DE NUEVA TABLET");
               System.out.println("Correo Electronico: " + correoElectronico);
               System.out.println("Nombre del dispositivo: " + nombreDispositivo);
               System.out.println("Visible para conexion: " + visibleParaConexion);
               System.out.println("Nota: el dispositivo sera encendido por defecto");
               break;
                case 3:
               System.out.println("SmartWatch");
               System.out.println("Ingrese Correo Electronico");
               dato = valorDatos.next();
               correoElectronico = dato;
               System.out.println("Ingrese Nombre Dispositivo");
               dato = valorDatos.next();
               nombreDispositivo = dato;
               System.out.println("visible para conexion");
               System.out.println("SI     NO");
               dato = valorDatos.next();
               visibleParaConexion = dato;
               System.out.println("-------------------------------------------");
               System.out.println("CREACION DE NUEVO SMARTWATCH");
               System.out.println("Correo Electronico: " + correoElectronico);
               System.out.println("Nombre del dispositivo: " + nombreDispositivo);
               System.out.println("Visible para conexion: " + visibleParaConexion);
               System.out.println("Nota: el dispositivo sera encendido por defecto");
               break;
               case 4:
               System.out.println("Smartphone");
               System.out.println("Ingrese Correo Electronico");
               dato = valorDatos.next();
               correoElectronico = dato;
               System.out.println("Ingrese Nombre Dispositivo");
               dato = valorDatos.next();
               nombreDispositivo = dato;
               System.out.println("visible para conexion");
               System.out.println("SI     NO");
               dato = valorDatos.next();
               visibleParaConexion = dato;
               System.out.println("-------------------------------------------");
               System.out.println("CREACION DE NUEVO SMARTPHONE");
               System.out.println("Correo Electronico: " + correoElectronico);
               System.out.println("Nombre del dispositivo: " + nombreDispositivo);
               System.out.println("Visible para conexion: " + visibleParaConexion);
               System.out.println("Nota: el dispositivo sera encendido por defecto");
               break;
               case 5:
               System.out.println("Auriculares");
               System.out.println("Ingrese Correo Electronico");
               dato = valorDatos.next();
               correoElectronico = dato;
               System.out.println("Ingrese Nombre Dispositivo");
               dato = valorDatos.next();
               nombreDispositivo = dato;
               System.out.println("visible para conexion");
               System.out.println("SI     NO");
               dato = valorDatos.next();
               visibleParaConexion = dato;
               System.out.println("-------------------------------------------");
               System.out.println("CREACION DE NUEVO AURICULARES");
               System.out.println("Correo Electronico: " + correoElectronico);
               System.out.println("Nombre del dispositivo: " + nombreDispositivo);
               System.out.println("Visible para conexion: " + visibleParaConexion);
               System.out.println("Nota: el dispositivo sera encendido por defecto");
               break;
               
            
       }
       
  }
   
    
}

