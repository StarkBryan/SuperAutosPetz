package com.mycompany.combate;

import java.util.Random;
import java.util.Scanner;
import com.mycompany.mascotas.*;
import com.mycompany.mascotas.tier2.*;
import static java.lang.Math.random;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author ASUS
 */
public class juego {

    mascotas mascotas = new mascotas();
    mascotas tienda[] = new mascotas[5];
    mascotas jugadorEnemigos[] = new mascotas[5];
    mascotas mascotasJugador[] = new mascotas[5];
    mascotas mascotaVacia[] = new mascotas[5];
    int ronda = 1;
    int nivel;

//      mascotasTienda = nuevaTienda.mascotasTienda(ronda);
    public void inicio() {
        String nombre;
        int opcion ;
        Scanner leer = new Scanner(System.in);

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

//    
//    int arreglo[] = new int[5];
    public void inicioBatalla() {

    }

    public int opcionesEntreBatallas() {
        int opcion = 0;
        System.out.println(" Comprar mascotas");
        System.out.println(" Comprar comida");
        System.out.println(" Ordenar mascotas como el usuario desee");
        System.out.println(" Fusionar mascotas (para subirlas de nivel)");
        System.out.println("Vender mascotas ");

        return opcion;
    }

//        
////       
//        return null;
//        
   
    
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
                    tienda[i] = eleccionAnimal(numeroAnimal);
                    break;
                case 2:
                    numeroAnimal = random.nextInt(16);
                    tienda[i] = eleccionAnimal(numeroAnimal);
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

    private mascotas[] mascotasJugador(int ronda) {

        System.arraycopy(tienda, 0, mascotasJugador, 0, mascotasJugador.length);

        System.out.println("Esto es lo tenes en tienda !");
        for (mascotas mascotasJugador1 : tienda) {
            System.out.println(mascotasJugador1);
        }

        return mascotasJugador;
    }

    public mascotas[] jugadorEnemigo() {
        Random random = new Random();
        int numeroAnimal;

        
        for (int i = 0; i < jugadorEnemigos.length; i++) {
            if (ronda == 1) {
                numeroAnimal = random.nextInt(8);
                jugadorEnemigos[i] = eleccionAnimal(numeroAnimal);

//            }else if (ronda) {
            }

        }
//        Mostramos  lo que tenemos en tienda 
        System.out.println("lista de enemigos !");
        for (mascotas jugadorEnemigos1 : jugadorEnemigos) {
            System.out.println(jugadorEnemigos1);
        }

        return jugadorEnemigos;
    }

    private mascotas[] comparacion(mascotas[] jugadorEnemigos, mascotas[] mascotasJugador, int turno) {

        return null;
    }

    
    // en este metodo tenemos  al que nos inicializa a cada animal 
    
    private mascotas eleccionAnimal(int numeroAnimal) {

        switch (numeroAnimal) {

            case 1:
                mascotas = new hormiga();
                break;
            case 2:
                mascotas = new pescado();
                break;
            case 3:
                mascotas = new mosquito();
                break;
            case 4:
                mascotas = new grillo();
                break;
            case 5:
                mascotas = new castor();
                break;
            case 6:
                mascotas = new caballo();
                break;
            case 7:
                mascotas = new nutria();
                break;
            case 8:
                mascotas = new escarabajo();
                break;
            case 9:
                mascotas = new sapo();
                break;
            case 10:
                mascotas = new dodo();
                break;
            case 11:
                mascotas = new elefante();
                break;
            case 12:
                mascotas = new puerco();
                break;
            case 13:
                mascotas = new pavoreal();
                break;
            case 14:
                mascotas = new rata();
                break;
            case 15:
                mascotas = new zorro();
                break;
            case 16:
                mascotas = new arania();
                break;
//               case 17:
//                return new caballo();
//               case 18:
//                return new caballo();
//                       
//             
                

        }
        return mascotas;

    }

  
}
