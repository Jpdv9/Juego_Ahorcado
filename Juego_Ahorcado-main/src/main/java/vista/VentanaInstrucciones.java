/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;

import javax.swing.JPanel;

/**
 *
 * @author jazam
 */

public class VentanaInstrucciones extends JFrame{
    private JLabel jlTitulo;
    private JPanel jpContenido;
    private JButton btnAtras;
    private JTextArea jtInstrucciones;

    
    
    public VentanaInstrucciones(){
        iniciarComponentes();        
    }
   
    private void iniciarComponentes(){
        //Configuracion de ventana
        setTitle("AHORCADO");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        jpContenido = new JPanel();
        add(jpContenido);
        
        jlTitulo = new JLabel("INSTRUCCIONES");
        jlTitulo.setBounds(55,30,500,65);
        jlTitulo.setFont(new Font ("Perpetua Titling MT", Font.ROMAN_BASELINE, 45));
        
        jtInstrucciones = new JTextArea("Hay un palabra escondida y tendras que adivinar cual es. Si ingresas una letra y no corresponde a la de la palabra se restará un intento. Ten cuidado solo tienes 10 intentos, si los gastas perderas el juego. ¡Buena Suerte!");
        jtInstrucciones.setFont(new Font("Agency FB",Font.BOLD,25));
        jtInstrucciones.setBounds(50,100, 400,300);
        jtInstrucciones.setLineWrap(true);
        jtInstrucciones.setWrapStyleWord(true);
        jtInstrucciones.setEditable(false);
        //jtInstrucciones.setEnabled(false);
        jtInstrucciones.setForeground(Color.BLACK);
        jtInstrucciones.setBackground(new Color(0,0,0,0));

        
        btnAtras = new JButton("Atras");
        btnAtras.setBounds(200,400, 100,50);
        btnAtras.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnAtras.setFocusable(false);
        btnAtras.setFont(new Font("Agency FB",Font.BOLD,25));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(btnAtras);
        jpContenido.add(jtInstrucciones);

        
        jpContenido.setSize(500,500);        
        jpContenido.setBounds(0,110, 519, 500);
        jpContenido.setLayout(null);


        ActionListener regresar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaInicio ventanaInicio = new VentanaInicio();
                dispose(); 
                
            }       
        };
        
        btnAtras.addActionListener(regresar);  
                
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                cerrarVentana();
            }
        });
    
    }
    
    private void cerrarVentana(){
        int respuesta;

        respuesta = JOptionPane.showConfirmDialog(
                    null,"¿Realmente dese abandonar el juego?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
}



   