/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combate.comida;

import com.mycompany.comida.comida;

/**
 *
 * @author ASUS
 */
public class randonComida {
    comida comida = new comida();
    
    
    public comida comidaAleatorio ( int numeroComida ){
        
        switch(numeroComida){
        
         case 1:
                comida = new manzana();
                break;
            case 2:
                comida = new miel ();
                break;
            case 3:
                comida = new naranja();
                break;
//            case 4:
//                comida = new naranja();
//                break;
//            case 5:
//                comida = new castor();
//                break;
//            case 6:
//                comida = new caballo();
//                break;
//            case 7:
//                comida = new nutria();
//                break;
//            case 8:
//                comida = new escarabajo();
//                break;
//            case 9:
//                comida = new sapo();
//                break;
//            case 10:
//                comida = new dodo();
//                break;
//            case 11:
//                comida = new elefante();
//                break;
//            case 12:
//                comida = new puerco();
//                break;
//            case 13:
//                comida = new pavoreal();
//                break;
//            case 14:
//                comida = new rata();
//                break;
//            case 15:
//                comida = new zorro();
//                break;
//            case 16:
//                comida = new arania();
//                break;
//                
//        
//        
        
    
    
    
        } 
    
    return comida;
    }
    
}
