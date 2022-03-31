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
    animalesRandon animalRandon = new animalesRandon();

    public mascotas[] tienda(int ronda) {
        Random random = new Random();
        int numeroAnimal;

        System.out.println(" TIENDA DE MASCOTAS ");
        System.out.println("Estas Mascotas tenemos en tienda !");
        System.out.println(" Escoge con sabiduria !");

        if (ronda < 4 && ronda > 0) {

            for (int i = 0; i < tienda.length - 2; i++) {

                switch (ronda) {
                    case 1:
                        numeroAnimal = random.nextInt(8) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;
                    case 2:
                        numeroAnimal = random.nextInt(16) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;
                    case 3:
                        numeroAnimal = random.nextInt(27) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;

                }
            }
        } else if (ronda > 3 && ronda < 7) {
            for (int i = 0; i < tienda.length - 1; i++) {

                switch (ronda) {
                    case 4:
                        numeroAnimal = random.nextInt(35) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;
                    case 5:
                        numeroAnimal = random.nextInt(43) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;
                    case 6:
                        numeroAnimal = random.nextInt(52) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;

                }
            }
        } else if (ronda < 6) {
            for (int i = 0; i < tienda.length ; i++) {

                switch (ronda) {
                    case 7:
                        numeroAnimal = random.nextInt(54) + 1;
                        tienda[i] = animalRandon.eleccionAnimal(numeroAnimal);
                        break;

                }
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
