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
         
         if(oro >2){
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
         } else// cerramos el if
         {
             System.out.println("no tienes suficiente oro para poder comprar mascotas");
         }
          
          
        
         
           
        

        return mascotasJugador;
    }
     public mascotas[] ordenaMascotas( mascotas[] mascotasOrdenadas ){ // aqui ordenamos los animales
         mascotas mascotaAuxiliar = new mascotas();
         mostrarMascotasJugador(mascotasOrdenadas);
         System.out.println(" Ordenar tus Mascotas");
         System.out.println(" Que animal desea mover ");
         int posicionActual = leer.nextInt();
         System.out.println(" Donde deseas mover el animal  ");
         int posicionFinal = leer.nextInt();
         
             mascotasOrdenadas[posicionActual-1]=mascotaAuxiliar;
             mascotasOrdenadas[posicionActual-1]= mascotasOrdenadas[posicionFinal-1];
             mascotasOrdenadas[posicionFinal-1]=mascotaAuxiliar;
             
             
             
     
     
     
     return mascotasOrdenadas;
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
    
    public void mostrarMascotasJugador(mascotas[] mostrarMascotas){
        
        
        for (int i = 0; i < mostrarMascotas.length; i++) {
            System.out.println(mostrarMascotas[i]);
        }
        
    
    
    
    }
    
    
    public mascotas [] fusionarMascotas(mascotas [] mascotasFusionar, mascotas[] tienda){
        System.out.println(" Desea fucionar una mascota desde su lista de animales ");
        System.out.println(" opcion -------------- 1");
        System.out.println(" Desea hacer la fusion desde la tienda ?");
        int opcion = leer.nextInt();
        if( opcion==1 ){
            
             mascotasFusionar[]
            
        
        }
        
        
        
    
    return mascotasFusionar;
    }
    

    
    
    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", oro=" + oro + '}';
    }
}
    
