/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combate.jugadores;

import com.mycompany.mascotas.mascotas;

/**
 *
 * @author ASUS
 */
public class jugador  {
    tiendaAnimales tiendaAnimales = new  tiendaAnimales();
    
    
    mascotas mascotasJugador[] = new mascotas[5];
    protected String nombre;
    protected int oro =10 ;
    
    
     private mascotas[] mascotasJugador(int ronda) {

        System.arraycopy(tiendaAnimales.tienda, 0, mascotasJugador, 0, mascotasJugador.length);

        System.out.println("Esto es lo tenes en tienda !");
        for (mascotas mascotasJugador1 : tiendaAnimales.tienda) {
            System.out.println(mascotasJugador1);
        }

        return mascotasJugador;
    }
    
    public int  comprar(  int oro){
        
        
        
    
        
    
    return 0;
    }
    public int venderMascota(){
    
    return oro;
    }

    
    
    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", oro=" + oro + '}';
    }
    
    
    
    
    

}
