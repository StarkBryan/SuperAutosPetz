package com.mycompany.combate;


import com.mycompany.combate.jugadores.jugador;
import com.mycompany.combate.jugadores.tiendaAnimales;
import java.util.Scanner;
import com.mycompany.mascotas.*;
import com.mycompany.mascotas.tier2.*;

import javax.swing.text.StyledEditorKit;

/**
 *
 * @author ASUS
 */
public class juego {
    
    
    
    
      Scanner leer = new Scanner(System.in);

    mascotas mascotas = new mascotas();
    mascotas tienda[] ;
    mascotas jugadorEnemigos[] = new mascotas[5];
    mascotas mascotasJugador[] = new mascotas[5];
    mascotas mascotaVacia[] = new mascotas[5];
    tiendaAnimales tiendaAnimales;
    jugador jugador1;
    int ronda;
  
 
        public juego (){
        jugador1 = new jugador();
    ronda = 1;
     
     
    }
       

    public void inicio() {
        
        int opcion;
      

        System.out.println();
        System.out.println();

        System.out.println("Elige una opcion: ");
        System.out.println("1) ¡Modo arena, enfrentamientos asincrónicos, sin temporizador de turno! ¿Puedes obtener 10 victorias?");
        System.out.println("2) Modo Versus, enfréntate a X otros jugadores, ¿puedes salir victorioso?");
        System.out.println("3) Modo creativo, arma tu equipo idóneo sin restricciones, ¡A por todas!");
        System.out.println("4) Salir");

        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                inicioBatalla();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("Gracias por Jugar ");
                break;
            default:
                break;
        }

    }




    public void opcionesEntreBatallas() {
        int opcion = 0;
        System.out.println(" Comprar mascotas");
        System.out.println(" Comprar comida");
        System.out.println(" Ordenar mascotas como el usuario desee");
        System.out.println(" Fusionar mascotas (para subirlas de nivel)");
        System.out.println("Vender mascotas ");
       opcion = leer.nextInt();
       
       if(opcion ==1){
           
           tienda=tiendaAnimales.tienda(ronda);
           
           mascotasJugador=jugador1.asiganmosMascotasJugador(ronda, tienda);
           
           
           
       }
    }
    
    
    
    
        public void inicioBatalla() {

    }
        
}