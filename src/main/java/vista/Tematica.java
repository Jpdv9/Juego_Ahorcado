/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Usuario.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jeanp
 */
public class Tematica extends JFrame{
    private JLabel jlTematica;
    private JButton btnAnimales;
    private JButton btnFrutas;
    private JButton btnMusica;
    private JButton btnNombres;
    private JButton btnColores;
    private JButton btnCuerpo;
    private JButton btnTransporte;
    private JButton btnPaises;
    private JButton btnDeportes;
    private JButton btnAtras;
    private JPanel jpContenido;

    public Tematica(Jugador jugador){
        //juegoMemoria = new JuegoMemoria(jugador);
        //juegoMemoria.iniciarRonda();
        iniciarComponentes();
        setSize(700,500);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Jugando a Adivinar");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    private void iniciarComponentes(){
        jpContenido = new JPanel();
        
        add(jpContenido);
        
        jlTematica = new JLabel("TEMATICAS");
        jlTematica.setBounds(320,20, 400,50);
        
        jpContenido.add(jlTematica);
        
        btnAnimales = new JButton("Animales");
        btnAnimales.setBounds(75,100, 150,50);
        btnFrutas = new JButton("Frutas");
        btnFrutas.setBounds(275,100, 150,50);
        btnMusica = new JButton("Música");
        btnMusica.setBounds(475,100, 150,50);
        btnNombres = new JButton("Nombres");
        btnNombres.setBounds(75,200, 150,50);
        btnColores = new JButton("Meses");
        btnColores.setBounds(275,200, 150,50);
        btnCuerpo = new JButton("Cuerpo");
        btnCuerpo.setBounds(475,200, 150,50);
        btnTransporte = new JButton("Transportes");
        btnTransporte.setBounds(75,300, 150,50);
        btnPaises = new JButton("Paises");
        btnPaises.setBounds(275,300, 150,50);
        btnDeportes = new JButton("Deportes");
        btnDeportes.setBounds(475,300, 150,50);
        btnAtras =new JButton("Atras");
        btnAtras.setBounds(275,400, 150,50);
        
        
       
        jpContenido.add(btnAnimales);
        jpContenido.add(btnFrutas);
        jpContenido.add(btnMusica);
        jpContenido.add(btnNombres);
        jpContenido.add(btnColores);
        jpContenido.add(btnCuerpo);
        jpContenido.add(btnTransporte);
        jpContenido.add(btnPaises);
        jpContenido.add(btnDeportes);
        jpContenido.add(btnAtras);
        
        jpContenido.setSize(700,500);        
        jpContenido.setBounds(0,150, 700, 500);
        jpContenido.setLayout(null);
        
        btnAnimales.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnFrutas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnMusica.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnNombres.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnColores.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnCuerpo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnTransporte.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnPaises.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        btnDeportes.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Jugador jugador = new Jugador();
                Configuracion configuracion = new Configuracion(jugador);
                dispose();
            }
        });
        
        ActionListener regresar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaJugador ventanajugador = new VentanaJugador();
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
