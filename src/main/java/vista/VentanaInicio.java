
package vista;


import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author jeanp
 */
public class VentanaInicio extends JFrame {
    
    private JLabel jlNombrejuego;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private JButton btnParaquesirve;
    private JPanel jpContenido;
    private JLabel jlMuneco;
    private JLabel jlMuneco2;
    private JLabel jlMuneco3;
    private JLabel jlMuneco4;
    private JLabel jlMuneco5;
    private JLabel jlMuneco6;
    private JLabel jlMuneco7;
    private JLabel jlMuneco8;
    private JLabel jlMuneco9;

    
    public VentanaInicio(){
        iniciarComponentes();        
    }

    private void iniciarComponentes(){
        //Configuracion de ventana
        setTitle("AHORCADO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        //Configuracion del encabezado

        jpContenido = new JPanel();
        
        jlMuneco = new JLabel("l");
        jlMuneco.setBounds(50,80,500,65);
        jlMuneco.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco.setHorizontalAlignment(JLabel.LEFT);
        
        
        jlMuneco2 = new JLabel("l");
        jlMuneco2.setBounds(50,40,500,65);
        jlMuneco2.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco2.setHorizontalAlignment(JLabel.LEFT);
       
        
        jlMuneco3 = new JLabel("l");
        jlMuneco3.setBounds(50,0,500,65);
        jlMuneco3.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco3.setHorizontalAlignment(JLabel.LEFT);
       
        
        jlMuneco4 = new JLabel("_");
        jlMuneco4.setBounds(95,-45,500,65);
        jlMuneco4.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco4.setHorizontalAlignment(JLabel.LEFT);
        
        jlMuneco5 = new JLabel("_");
        jlMuneco5.setBounds(75,-45,500,65);
        jlMuneco5.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco5.setHorizontalAlignment(JLabel.LEFT);
       
        
        jlMuneco6 = new JLabel("_");
        jlMuneco6.setBounds(55,-45,500,65);
        jlMuneco6.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco6.setHorizontalAlignment(JLabel.LEFT);
       
        
        jlMuneco7 = new JLabel("O");
        jlMuneco7.setBounds(108,41,500,50);
        jlMuneco7.setFont(new Font ("arial", Font.PLAIN, 40));
        jlMuneco7.setHorizontalAlignment(JLabel.LEFT);
        jlMuneco7.setForeground(Color.RED);
        
        jlMuneco8 = new JLabel("l");
        jlMuneco8.setBounds(118,10,500,55);
        jlMuneco8.setFont(new Font ("arial", Font.PLAIN, 55));
        jlMuneco8.setHorizontalAlignment(JLabel.LEFT);
        
        jlMuneco9 = new JLabel("_");
        jlMuneco9.setBounds(42,75,500,65);
        jlMuneco9.setFont(new Font ("arial", Font.BOLD, 55));
        jlMuneco9.setHorizontalAlignment(JLabel.LEFT);
        
        
        jlNombrejuego = new JLabel("AH_RCAD_");
        jlNombrejuego.setBounds(55,30,500,65);
        jlNombrejuego.setFont(new Font ("Perpetua Titling MT", Font.ROMAN_BASELINE, 45));
        jlNombrejuego.setHorizontalAlignment(JLabel.CENTER);
        jlNombrejuego.setForeground(Color.RED);
        
        
        btnJugar = new JButton();
        btnJugar.setText("Jugar");
        btnJugar.setBounds(180,120,150,50);
        btnJugar.setForeground(Color.red);
        btnJugar.setFont(new Font("Agency FB",Font.BOLD,35));
       
        btnInstrucciones = new JButton();
        btnInstrucciones.setText("Como Jugar");
        btnInstrucciones.setForeground(Color.BLUE);
        btnInstrucciones.setFont(new Font("Agency FB",Font.BOLD,25));
        btnInstrucciones.setBounds(80,200, 150,50);
        
        btnParaquesirve = new JButton();
        btnParaquesirve.setBounds(280,200, 150,50);
        btnParaquesirve.setText("¿Para qué sirve?");
        btnParaquesirve.setForeground(Color.BLUE);
        btnParaquesirve.setFont(new Font("Agency FB",Font.BOLD,21));
        
        jpContenido.setSize(500,500);        
        jpContenido.setBounds(0,110, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido,BorderLayout.CENTER);

        
        jpContenido.add(jlNombrejuego);
        jpContenido.add(btnJugar);
        jpContenido.add(btnInstrucciones);
        jpContenido.add(btnParaquesirve);
        jpContenido.add(jlMuneco);
        jpContenido.add(jlMuneco2);
        jpContenido.add(jlMuneco3);
        jpContenido.add(jlMuneco4);
        jpContenido.add(jlMuneco5);
        jpContenido.add(jlMuneco6);
        jpContenido.add(jlMuneco7);
        jpContenido.add(jlMuneco8);
        jpContenido.add(jlMuneco9);
        
        
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaJugador ventanajugador = new VentanaJugador();
                dispose(); 
            }       
        };
        
        btnJugar.addActionListener(accion);
        
        Image miIcono = miPantalla.getImage("src/main/java/Imagenes/Cuerda.png");
	setIconImage(miIcono);
    }

}