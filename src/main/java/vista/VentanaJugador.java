/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Usuario.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author jeanp
 */
public class VentanaJugador extends JFrame{
    private JPanel jpContenido;
    private JLabel jlNombrejuego;
    private JLabel jlUsuario;
    private JTextField txtNombre;
    private JButton btnSiguiente;
    private JButton btnAtras;
   
    public VentanaJugador(){
        iniciarComponentes();
        //Configuracion de ventana
        setTitle("AHORCADO");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        

    }
    
    private void iniciarComponentes(){
        jpContenido = new JPanel();
        
        add(jpContenido);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
      
        
        jlNombrejuego = new JLabel("AH_RCAD_");
        jlNombrejuego.setBounds(0,60,500,55);
        jlNombrejuego.setForeground(Color.RED);
        jlNombrejuego.setFont(new Font ("Perpetua Titling MT", Font.ROMAN_BASELINE, 45));
        jlNombrejuego.setHorizontalAlignment(JLabel.CENTER);
        
        jlUsuario = new JLabel("ESCRIBE TU NOMBRE");
        jlUsuario.setForeground(Color.BLUE);
        jlUsuario.setFont(new Font("Agency FB",Font.BOLD,25));
        jlUsuario.setBounds(180,150, 400,20);
        
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20));
        txtNombre.setBounds(125,190,250, 30);
        
        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setBounds(275,250, 100,50);
        btnSiguiente.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnSiguiente.setFocusable(false);
        btnSiguiente.setFont(new Font("Agency FB",Font.BOLD,22));
        
        
        btnAtras = new JButton("Atras");
        btnAtras.setBounds(125,250, 100,50);
        btnAtras.setAlignmentX(JButton.CENTER_ALIGNMENT);
        btnAtras.setFocusable(false);
        btnAtras.setFont(new Font("Agency FB",Font.BOLD,25));
        
        jpContenido.add(jlNombrejuego);
        jpContenido.add(jlUsuario);
        jpContenido.add(txtNombre);
        jpContenido.add(btnSiguiente);
        jpContenido.add(btnAtras);
        
        jpContenido.setSize(500,500);        
        jpContenido.setBounds(0,110, 519, 500);
        jpContenido.setLayout(null);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnSiguiente.addActionListener(manejadorEventos);
        txtNombre.addKeyListener(manejadorEventos);
        
        txtNombre.requestFocusInWindow();
        
        Image miIcono = miPantalla.getImage("src/main/java/Imagenes/Cuerda.png");
	setIconImage(miIcono);
        
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
    private void siguienteVentana(){
        String nombre =txtNombre.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);        
            dispose(); 
            Tematica configuracion = new Tematica(jugador);              
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
        }
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnSiguiente){                
                siguienteVentana();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyCode() == e.VK_ENTER){
                btnSiguiente.doClick();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }       
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
