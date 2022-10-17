/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jeanp
 */
public class Ahorcado {
    public static final int maximos_intentos = 10;
    public static int intentos = maximos_intentos;
    public static int opcion = -1;
    public static String letra = "";
    private static String palabra = "";
    public static char[] palabraOculta;
    
    public static final ArrayList<String> palabras = new ArrayList<>();
    
    public static final String[][] opciones = 
    {
        {"perro", "gato", "leon", "jirafa"},
        {"mango", "uva", "manzana", "sandia"},
        {"rock", "metal", "salsa", "merengue"},
        {"juan", "brayan", "carlos", "felipe"},
        {"enero", "marzo", "abril", "junio"},
        {"codo", "rodilla", "cabeza", "hombros"},
        {"bici", "carro", "bus", "moto"},
        {"corea", "china", "colombia", "venezuela"},
        {"baloncesto", "football", "tenis", "natacion"}
    };
    
    public static void setLetra(final String letra)
    {
        Ahorcado.letra = letra;
    }
    
    public static void palabras()
    {
        String palabraSecreta = getPalabraSecreta();
        palabraOculta = intentos <= 0 || palabraSecreta.isEmpty() ? getOcultarPalabra(palabraSecreta) : palabraOculta;
        
        if(palabraOculta == null)
        {
            palabraOculta = getOcultarPalabra(palabraSecreta);
        }
        
        boolean juegoGanado = !hayLetrasOcultas(palabraOculta);
        
        char letra = Ahorcado.letra.charAt(0);
        boolean letraAcertada = false;

        for(int i = 0; i < palabraSecreta.length(); i++){
            if(palabraSecreta.charAt(i) == letra){
                palabraOculta[i] = letra;
                letraAcertada = true;
            }
        }
        
        if(!letraAcertada){
            System.out.println("No has hacertado");
            
            intentos--;
            if(intentos <= 0){
                System.out.println("Has perdido");
            }
            
            System.out.println("Te queda " + intentos + " Intentos");
            System.out.println(palabraOculta);
            System.out.println("Introduce una letra");
        }
        else
        {
            juegoGanado = !hayLetrasOcultas(palabraOculta);

            if(juegoGanado){
                JOptionPane.showConfirmDialog(
                    null,"Has Acertado, ¿Deseas continuar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);

            }
            
            for(char c : palabraOculta)
            {
                System.out.print(c);
            }
        }
       
        System.out.println("");
        
    }
    
    static String getPalabraSecreta(){
        if(intentos <= 0 || Ahorcado.palabra.isEmpty())
        {
            String palabra = "";
        
            if(Ahorcado.opcion >= 0)
            {
                Random aleatorio = new Random();
                int n = aleatorio.nextInt(opciones[Ahorcado.opcion].length);

                Ahorcado.palabra = opciones[Ahorcado.opcion][n];
            }
            
            return Ahorcado.palabra;
        }
        else
        {
            return Ahorcado.palabra;
        }
    }
    
    static char[] getOcultarPalabra(String palabra){
        int numeroLetrasPalabra = palabra.length();
        char [] palabraOculta = new char[numeroLetrasPalabra];
        
        for(int i = 0; i < palabraOculta.length; i++){
            palabraOculta[i] = '_';
        }
        
        return palabraOculta;
    }
    
    static boolean hayLetrasOcultas(char[] array){
        for(char l:array){
            if(l == '_'){
                return true;
            }
        }
        return false;
    }
}
