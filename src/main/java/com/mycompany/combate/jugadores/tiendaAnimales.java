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
public class tiendaAnimales {
     mascotas tienda[] = new mascotas[5];
     animalesRandon animalRandon= new animalesRandon();
    
    
     public mascotas[] tienda( int ronda ) {
        Random random = new Random();
        int numeroAnimal;

        System.out.println(" TIENDA DE MASCOTAS ");
        System.out.println("Estas Mascotas tenemos en tienda !");
        System.out.println(" Escoge con sabiduria !");

        for (int i = 0; i < tienda.length; i++) {
            switch (ronda) {
                case 1:
                    numeroAnimal = random.nextInt(8);
                    tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                    break;
                case 2:
                    numeroAnimal = random.nextInt(16);
                    tienda[i] =animalRandon.eleccionAnimal(numeroAnimal);
                    break;
                case 3:
                    
                    break;
                default:
                    break;
            }
            

        }
        
        
//        Mostramos  lo que tenemos en tienda 
        System.out.println("Esto es lo tenes en tienda !");
        for (int i = 0; i < tienda.length; i++) {
            System.out.println(tienda[i]);
            
        }
        
        
        
        
        
        
       

        return tienda;

    }

    
    
    
    
}
