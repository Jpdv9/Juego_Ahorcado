
package Logica;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jeanp
 */
public class Ahorcado {
    
    //Variables
    public static final int maximos_intentos = 10;
    public static int intentos = maximos_intentos;
    public static int opcion = -1;
    public static String letra = "";
    private static String palabra = "";
    public static char[] palabraOculta;
    
    //
    public static final ArrayList<String> palabras = new ArrayList<>();
    
    //Las categorias y palabras de cada una de ellas
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
        int respuesta;
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
            intentos--;
            if(intentos <= 0){
                respuesta = JOptionPane.showConfirmDialog(
                    null,"Has Fallado, ¿Deseas continuar?", "Malardo",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
 
                if (respuesta == JOptionPane.YES_OPTION){
                    Ahorcado.palabras();
                }
            }  
        }
        else
        {
            juegoGanado = !hayLetrasOcultas(palabraOculta);
            
            
            if(juegoGanado){    
                
                respuesta = JOptionPane.showConfirmDialog(
                    null,"Has Perdido, ¿Deseas continuar?", "Felicidades",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    Ahorcado.getPalabraSecreta();
                }
            }
        }
       
        System.out.println("");
        
    }
    
    //Dar al lazar una palabra de la categoria seleccionada
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
    
    //Ocultar las letras de las palabras
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
