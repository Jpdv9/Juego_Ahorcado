
package vista;

import Usuario.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author jeanp
 */
public class Configuracion extends JFrame {
    private JLabel jlPalabras;
    private JTextField txtNumeroPalabras;
    private JButton btnIniciar;
    private JPanel jpContenido;
    
    public Configuracion(Jugador jugador) {
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
        
        jlPalabras = new JLabel("CANTIDAD DE PALABRAS");
        jlPalabras.setBounds(125,120, 250,50);
        jlPalabras.setForeground(Color.BLACK);
        jlPalabras.setFont(new Font("Agency FB",Font.BOLD,30));
        jlPalabras.setHorizontalAlignment(JLabel.CENTER);
        
        txtNumeroPalabras = new JTextField("");
        txtNumeroPalabras.setHorizontalAlignment(JTextField.CENTER);
        txtNumeroPalabras.setForeground(Color.GRAY);
        txtNumeroPalabras.setFont(new Font("arial", Font.BOLD, 20));
        txtNumeroPalabras.setBounds(50,200,410, 40);  
        
        btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(175,300,150, 50);  
        
        jpContenido.add(jlPalabras);
        jpContenido.add(txtNumeroPalabras);
        jpContenido.add(btnIniciar);
        
        jpContenido.setSize(500,500);        
        jpContenido.setBounds(0,150, 700, 500);
        jpContenido.setLayout(null);
        
        Image miIcono = miPantalla.getImage("src/main/java/Imagenes/Cuerda.png");
	setIconImage(miIcono);
        
      
        btnIniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero = 0;
                try{
                    numero = Integer.parseInt(txtNumeroPalabras.getText());
                    Jugador jugador = new Jugador();
                    VentanaJuego ventanajuego = new VentanaJuego(jugador);
                    dispose();
                } catch(NumberFormatException ex){
                     JOptionPane.showMessageDialog(null,
                    "Por favor ingrese un numero", 
                    "Error de Entrada de Dato",
                    JOptionPane.ERROR_MESSAGE);
                }                
            }
        });
        
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
