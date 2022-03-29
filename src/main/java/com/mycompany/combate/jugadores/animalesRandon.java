/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combate.jugadores;

import com.mycompany.mascotas.caballo;
import com.mycompany.mascotas.castor;
import com.mycompany.mascotas.escarabajo;
import com.mycompany.mascotas.grillo;
import com.mycompany.mascotas.hormiga;
import com.mycompany.mascotas.mascotas;
import com.mycompany.mascotas.mosquito;
import com.mycompany.mascotas.nutria;
import com.mycompany.mascotas.pescado;
import com.mycompany.mascotas.tier2.arania;
import com.mycompany.mascotas.tier2.dodo;
import com.mycompany.mascotas.tier2.elefante;
import com.mycompany.mascotas.tier2.pavoreal;
import com.mycompany.mascotas.tier2.puerco;
import com.mycompany.mascotas.tier2.rata;
import com.mycompany.mascotas.tier2.sapo;
import com.mycompany.mascotas.tier2.zorro;

/**
 *
 * @author ASUS
 */
public class animalesRandon {
    
    
     mascotas mascotas = new mascotas();
    
     public mascotas eleccionAnimal(int numeroAnimal) {

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
