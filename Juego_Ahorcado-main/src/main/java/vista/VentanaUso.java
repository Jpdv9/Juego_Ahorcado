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

public class VentanaUso extends JFrame{
    private JLabel jlTitulo;
    private JPanel jpContenido;
    private JButton btnAtras;
    private JTextArea jtuso;

    
    
    public VentanaUso(){
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
        
        jlTitulo = new JLabel("¿Para que sirve?");
        jlTitulo.setBounds(55,30,500,65);
        jlTitulo.setFont(new Font ("Perpetua Titling MT", Font.ROMAN_BASELINE, 25));
        
        jtuso = new JTextArea("Este es un juego de estrategia el cual desarrolla muchas habilidades como la ortografia, la memoria, la atención y el cual desarrolla astusia no solo en los niños sino tambien en las personas adultas ya que hay que escoger los metodos correctos para desarrollar el juego sin llegar a perder.");
        jtuso.setFont(new Font("Agency FB",Font.BOLD,25));
        jtuso.setBounds(50,100, 400,300);
        jtuso.setLineWrap(true);
        jtuso.setWrapStyleWord(true);
        jtuso.setEditable(false);
        //jtuso.setEnabled(false);
        jtuso.setForeground(Color.BLACK);
        jtuso.setBackground(new Color(0,0,0,0));

        
        btnAtras = new JButton("Atras");
        btnAtras.setBounds(200,400, 100,50);
        btnAtras.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnAtras.setFocusable(false);
        btnAtras.setFont(new Font("Agency FB",Font.BOLD,25));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(btnAtras);
        jpContenido.add(jtuso);

        
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



   