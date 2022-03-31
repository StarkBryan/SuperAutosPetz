/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combate.jugadores;

import com.mycompany.combate.mascotaVacia.mascotaVacia;
import com.mycompany.mascotas.mascotas;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class jugador  {
    
    tiendaAnimales tiendaAnimales = new  tiendaAnimales();
    Scanner leer = new Scanner(System.in);
    
    mascotas mascotasJugador[] = new mascotas[5];
    protected String nombre;
    protected int oro =10 ; 
    mascotas mascotaVacia;
    
    public jugador(){
        mascotaVacia = new mascotaVacia(); 
        mascotasJugador[0] =  mascotaVacia;
         mascotasJugador[1] =  mascotaVacia;
         mascotasJugador[2] =  mascotaVacia;
         mascotasJugador[3] =  mascotaVacia;
         
    
    }
    
     public mascotas[] asiganmosMascotasJugador(int ronda, mascotas[] tiendaAnimales) {
         boolean verifiacion=false;
         //llenaremos el arrelgo del jugador 
         // para eso le decimos al usuario final que escoja que desea elegir 
         System.out.println(" Seleccione una mascota");
         int opcion = leer.nextInt();
         int salir =1;
         
         while ( oro >2 && salir!=2){
             
         
         if(ronda >0 && ronda<4  ){ // de la primera a la tercera ronda 
         if(opcion>0 && opcion <4 && tiendaAnimales[opcion-1]!=mascotaVacia){ // 
             for (int i = 0; i < mascotasJugador.length; i++) {
                 if(mascotasJugador[i]==mascotaVacia){
                 mascotasJugador[i] = tiendaAnimales[opcion-1];
                 tiendaAnimales[opcion-1]=mascotaVacia;
                 verifiacion=true;
                 oro=comprar(oro);
                 break;
                 }
                 
             }
             if(verifiacion= false){
                 System.out.println("Ya no hay espacios para mas mascotas!");
             }
             verifiacion = false;
             
         }
         }else if(ronda >3 && ronda<7 ){// de la 4 ronda para la septima 
             if(opcion>0 && opcion <5 && tiendaAnimales[opcion-1]!=mascotaVacia){
                 for (int i = 0; i < mascotasJugador.length; i++) {
                 if(mascotasJugador[i]==mascotaVacia){
                 mascotasJugador[i] = tiendaAnimales[opcion-1];
                 tiendaAnimales[opcion-1]=mascotaVacia;
                 verifiacion=true;
                 oro=comprar(oro);
                 break;
                 }
                 
             }
             if(verifiacion= false){
                 System.out.println("Ya no hay espacios para mas mascotas!");
             }
             verifiacion = false;
             
         }
         // 
         
         }else if(ronda >6 ){// de la 4 ronda para la septima 
             if(opcion>0 && opcion <6 && tiendaAnimales[opcion-1]!=mascotaVacia){
                 for (int i = 0; i < mascotasJugador.length; i++) {
                 if(mascotasJugador[i]==mascotaVacia){
                 mascotasJugador[i] = tiendaAnimales[opcion-1];
                 tiendaAnimales[opcion-1]=mascotaVacia;
                 verifiacion=true;
                 oro=comprar(oro);
                 break;
                 }
                 
             }
             if(verifiacion= false){
                 System.out.println("Ya no hay espacios para mas mascotas!");
             }
             verifiacion = false;
             
         }
         // 
         
         }
         
         
         
         
         }// aqui cerramos el while 
          
          
          
        
         
           
        

        return mascotasJugador;
    }
     
    
    public int  comprar(  int oro){
        return oro-3;
    }
    public int venderMascota(int nivel){
        if(nivel ==1){
            return oro+1;
        }else if(nivel == 2){
           return oro +2;
           
        }else if (nivel == 3){ 
        return oro +3;
        }
        return 0;
        
    
    
    }

    
    
    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", oro=" + oro + '}';
    }
}
    
