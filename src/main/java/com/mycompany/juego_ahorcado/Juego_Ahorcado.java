/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juego_ahorcado;

import javax.swing.JFrame;
import vista.VentanaInicio;

/**
 *
 * @author jeanp
 */
public class Juego_Ahorcado {

    public static void main(String[] args) {
       VentanaInicio ventana = new VentanaInicio();
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //Ahorcado.palabras();
    }
}
