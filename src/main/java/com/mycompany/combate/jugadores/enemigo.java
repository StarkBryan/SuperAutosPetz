/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combate.jugadores;

import com.mycompany.mascotas.mascotas;
import java.util.Random;

/**
 *
 * @author ASUS
 */
public class enemigo {
    
    
//    
//        juego juego1 = new juego();
//        juego1.tienda(1);
//        
    
           animalesRandon animalRandon= new animalesRandon();
      mascotas mascotas = new mascotas();
       mascotas jugadorEnemigos[] = new mascotas[5];
       
       
       protected String IA;
    
    

    
    
       public mascotas jugadorEnemigo(int ronda) {
           
            Random random = new Random();
        int numeroAnimal;

        
        for (int i = 0; i < jugadorEnemigos.length; i++) {
            if (ronda == 1) {
                numeroAnimal = random.nextInt(8);
                
                jugadorEnemigos[i] = animalRandon.eleccionAnimal(numeroAnimal);

//            }else if (ronda) {
            }

        }
//        Mostramos  lo que tenemos en tienda 
        System.out.println("lista de enemigos !");
        for (mascotas jugadorEnemigos1 : jugadorEnemigos) {
            System.out.println(jugadorEnemigos1);
        }
           
           
       return mascotas;
       }

 
}
