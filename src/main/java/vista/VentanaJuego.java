
package vista;

import Logica.Ahorcado;
import Usuario.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author jeanp
 */
public class VentanaJuego extends JFrame{
    private JLabel jlPalabraOculta;
    private JLabel jlNumeroPalabra;
    private JLabel jlIntentos;
    private JLabel jlErrores;
    private JLabel jlCorrectas;
    private JLabel jlDigitarLetra;
    private JTextField txtDigitar;
    private JPanel jpContenido;
    private JButton btnVerificar;
    
    public VentanaJuego(Jugador jugador){
        iniciarComponentes();
        //Configuracion de ventana
        setTitle("AHORCADO");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    public static String charToString(char[] palabraOculta){
        String palabra = "";
        if(palabraOculta != null){
            for(char c: palabraOculta){
            palabra += c;
            }
        }
        
        return palabra;
    }
    
    
    private void iniciarComponentes(){
        btnVerificar = new JButton("Verificar");
        jpContenido = new JPanel();
        add(jpContenido);
        
        jlPalabraOculta = new JLabel(charToString(Ahorcado.palabraOculta));
        jlPalabraOculta.setBounds(350,190,300, 50); 
        jlPalabraOculta.setFont(new Font("Agency FB",Font.BOLD,40));
        
        //jlIntentos = new JLabel(Ahorcado.intentos);
        
        jlNumeroPalabra = new JLabel("PALABRA: ");
        jlNumeroPalabra.setBounds(200,200,200, 40);
        jlNumeroPalabra.setForeground(Color.BLACK);
        jlNumeroPalabra.setFont(new Font("Agency FB",Font.BOLD,30));
        jlNumeroPalabra.setHorizontalAlignment(JLabel.CENTER);
        
        jlErrores = new JLabel("Errores: ");
        jlErrores.setBounds(450,350,100, 40);
        jlErrores.setForeground(Color.RED);
        jlErrores.setFont(new Font("Agency FB",Font.BOLD,30));
        jlErrores.setHorizontalAlignment(JLabel.RIGHT);
        
        jlCorrectas = new JLabel("Correctas: ");
        jlCorrectas.setBounds(100,350,125, 40);
        jlCorrectas.setForeground(Color.GREEN);
        jlCorrectas.setFont(new Font("Agency FB",Font.BOLD,30));
        jlCorrectas.setHorizontalAlignment(JLabel.LEFT);
        
        jlIntentos = new JLabel("INTENTOS RESTANTES");
        jlIntentos.setBounds(250,50,200, 50);
        jlIntentos.setForeground(Color.BLUE);
        jlIntentos.setFont(new Font("Agency FB",Font.BOLD,30));
     
        
        jlDigitarLetra = new JLabel("Escriba una letra");
        jlDigitarLetra.setBounds(200,150,150, 40);
        
        
        txtDigitar = new JTextField("");
        txtDigitar.setHorizontalAlignment(JTextField.CENTER);
        txtDigitar.setForeground(Color.GRAY);
        txtDigitar.setFont(new Font("arial", Font.BOLD, 20));
        txtDigitar.setBounds(250,250,200, 40); 
   
        
        btnVerificar.setBounds(275, 290, 150, 40);
        btnVerificar.setHorizontalAlignment(JButton.CENTER);
        
        jpContenido.add(btnVerificar);
        jpContenido.add(jlNumeroPalabra);
        jpContenido.add(jlErrores);
        jpContenido.add(jlCorrectas);
        jpContenido.add(jlIntentos);
        jpContenido.add(txtDigitar);
        jpContenido.add(jlPalabraOculta);
        
        jpContenido.setSize(700,500);        
        jpContenido.setBounds(0,150, 700, 500);
        jpContenido.setLayout(null);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                cerrarVentana();
            }
        });
        
        btnVerificar.addMouseListener(new MouseListener(){
            @Override
            public void mouseReleased(MouseEvent e) {
               Ahorcado.setLetra(txtDigitar.getText().toLowerCase());
               Ahorcado.palabras();
               

               
               jlPalabraOculta.setText(charToString(Ahorcado.palabraOculta));
               txtDigitar.setText("");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    private void txtDigitarKeyTyped(java.awt.event.KeyEvent evt)
    {
    if(txtDigitar.getText().length() >= 10)
        {
            evt.consume();
        }
    } 
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public int getIntentos(){
        return Ahorcado.intentos;
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
