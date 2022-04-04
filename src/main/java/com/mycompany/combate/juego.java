package com.mycompany.combate;


import com.mycompany.combate.jugadores.enemigo;
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
      int ronda=1;
     
     
    enemigo ia = new enemigo();
  
    
  
 
        public juego (){
        tiendaAnimales = new tiendaAnimales();
            
        jugador1 = new jugador();
  
     
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
                opcionesEntreBatallas();
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
          
        
           while(opcion !=6) {
               System.out.println("la cantidad de oro es ");
              
        System.out.println(" 1  Comprar mascotas");
        System.out.println(" 2  Comprar comida");
        System.out.println(" 3  Ordenar mascotas como el usuario desee");
        System.out.println(" 4  Fusionar mascotas (para subirlas de nivel)");
        System.out.println(" 5  Vender mascotas ");
               System.out.println("6 ------------------salir");
       opcion = leer.nextInt();
       
    
          switch (opcion) {
             
              case 1:
                 tienda=tiendaAnimales.tienda(ronda);
                  mascotasJugador=jugador1.asiganmosMascotasJugador(ronda, tienda);
                   
                  
                  break;
              case 2:
                  ia.jugadorEnemigo(jugadorEnemigos, ronda);

                  break;
              case 3:
                  
                  mascotasJugador=jugador1.ordenaMascotas(mascotasJugador);
                  break;
             
                
                   case 4:
                  mascotasJugador=jugador1.fusionarMascotas(mascotasJugador, tienda);
                  
               
                  break;
                  
                   case 5:
                       mascotasJugador=jugador1.venderMascota(mascotasJugador);
                       break; 
          }
           }
       
    }
    
    
    
    
    
    
        public void inicioBatalla() {
            
            System.out.println(" ***********Empiza el combate ********");
            System.out.println(" Equipo tu equipo es");
           jugador1.mostrarMascotasJugador(mascotasJugador);
            System.out.println("las mascotas del enemigo son ");
            ia.jugadorEnemigo(jugadorEnemigos, ronda);
            
            for (int i = 0; i < mascotasJugador.length; i++) {
                if (mascotasJugador[i].danio>jugadorEnemigos[i].vida) {
                    System.out.println("has perdido contra el oponente ");
                    
                }
                
               
                    
                
                
            }
            
            
            
            
            
              

    }
        
        
        
        
        
}