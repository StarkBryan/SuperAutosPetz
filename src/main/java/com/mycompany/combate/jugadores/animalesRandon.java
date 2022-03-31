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
import com.mycompany.mascotas.tier2.*;
import com.mycompany.mascotas.tier3.*;
import com.mycompany.mascotas.tier4.*;

import com.mycompany.mascotas.tier5.*;
import com.mycompany.mascotas.tier6.*;

import com.mycompany.mascotas.tier7.*;

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
                
               case 17:
                mascotas= new camello();
               case 18:
                mascotas = new mapache();
                  case 19:
                mascotas = new jirafa();
                break;
            case 20:
                mascotas = new tortuga();
                break;
            case 21:
                mascotas = new caracol();
                break;
            case 22:
                mascotas = new ovejaCabra();
                break;
            case 23:
                mascotas = new conejo();
                break;
            case 24:
                mascotas = new lobo();
                break;
                  case 25:
                mascotas = new buey();
                break;
            case 26:
                mascotas = new canguro();
                break;
            case 27:
                mascotas = new buho();
                break;
            case 28:
                mascotas = new venado();
                break;
            case 29:
                mascotas = new loro();
                break;
            case 30:
                mascotas = new hipopotamo();
                break;
                  case 31:
                mascotas = new delfin();
                break;
            case 32:
                mascotas = new puma();
                break;
            case 33:
                mascotas = new ballena();
                break;
            case 34:
                mascotas = new ardilla();
                break;
            case 35:
                mascotas = new llama();
                break;
            case 36:
                mascotas = new foca();
                break;
                
                case 37:
                mascotas = new jaguar();
                break;
            case 38:
                mascotas = new escorpion();
                break;
            case 39:
                mascotas = new rinoceronte();
                break;
            case 40:
                mascotas = new mono();
                break;
            case 41:
                mascotas = new cocodrilo();
                break;
            case 42:
                mascotas = new vaca();
                break; 
                  case 43:
                mascotas = new chompipe();
                break;
                  case 44:
                mascotas = new panda();
                break;
            case 45:
                mascotas = new gato();
                break;
            case 46:
                mascotas = new tigre();
                break;
            case 47:
                mascotas = new serpiente();
                break;
            case 48:
                mascotas = new mamut();
                break;
                  case 49:
                mascotas = new leopardo();
                break;
            case 50:
                mascotas = new gorilla();
                break;
            case 51:
                mascotas = new pulpo();
                break;
            case 52:
                mascotas = new mosca();
                break;
            case 53:
                mascotas = new quetzal();
                break;
            case 54:
                mascotas = new camaleon();
                break;
             
                

        }
        return mascotas;

    }

    
    
    
    
}
