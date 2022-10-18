
package vista;

import Logica.Ahorcado;
import Usuario.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
    private JLabel jlImagenn1,jlImagenn2,jlImagenn3,
                   jlImagenn4,jlImagenn5,jlImagenn6,jlImagenn7,
                   jlImagenn8, jlImagenn9, jlImagenn10;


    
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
    
    // Pasar de char a string
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
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        //Configuracion del encabezado
        
        jlPalabraOculta = new JLabel(charToString(Ahorcado.palabraOculta));
        jlPalabraOculta.setBounds(350,190,300, 50); 
        jlPalabraOculta.setFont(new Font("Agency FB",Font.BOLD,40));
        
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
        
        jlIntentos = new JLabel("AHORCADO");
        jlIntentos.setBounds(275,10,200, 50);
        jlIntentos.setForeground(Color.RED);
        jlIntentos.setFont(new Font("Agency FB",Font.BOLD,30));
     
        
        jlDigitarLetra = new JLabel("Escriba una letra");
        jlDigitarLetra.setBounds(200,150,150, 40);
        
        
        txtDigitar = new JTextField("");
        txtDigitar.setHorizontalAlignment(JTextField.CENTER);
        txtDigitar.setForeground(Color.GRAY);
        txtDigitar.setFont(new Font("arial", Font.BOLD, 20));
        txtDigitar.setBounds(250,250,200, 40); 
        
        Icon imagen1 = new ImageIcon("src/main/java/Imagenes/imagen1.png");
        jlImagenn1 = new JLabel(imagen1);
        jlImagenn1.setBounds(100,40,123,52);
        
        Icon imagen2 = new ImageIcon("src/main/java/Imagenes/imagen2.png");
        jlImagenn2 = new JLabel(imagen2);
        jlImagenn2.setBounds(250,40,160,170);
        
        Icon imagen3 = new ImageIcon("src/main/java/Imagenes/imagen3.png");
        jlImagenn3 = new JLabel(imagen3);
        jlImagenn3.setBounds(250,40,160,170);
        
        Icon imagen4 = new ImageIcon("src/main/java/Imagenes/imagen4.png");
        jlImagenn4 = new JLabel(imagen4);
        jlImagenn4.setBounds(250,40,160,170);
        
        Icon imagen5 = new ImageIcon("src/main/java/Imagenes/imagen5.png");
        jlImagenn5 = new JLabel(imagen5);
        jlImagenn5.setBounds(250,40,160,170);
        
        Icon imagen6 = new ImageIcon("src/main/java/Imagenes/imagen6.png");
        jlImagenn6 = new JLabel(imagen6);
        jlImagenn6.setBounds(250,40,160,170);
        
        Icon imagen7 = new ImageIcon("src/main/java/Imagenes/imagen7.png");
        jlImagenn7 = new JLabel(imagen7);
        jlImagenn7.setBounds(250,40,160,170);
        
        Icon imagen8 = new ImageIcon("src/main/java/Imagenes/imagen8.png");
        jlImagenn8 = new JLabel(imagen8);
        jlImagenn8.setBounds(250,40,160,170);
        
        Icon imagen9 = new ImageIcon("src/main/java/Imagenes/imagen9.png");
        jlImagenn9 = new JLabel(imagen9);
        jlImagenn9.setBounds(250,40,160,170);
        
        Icon imagen10 = new ImageIcon("src/main/java/Imagenes/imagen10.png");
        jlImagenn10 = new JLabel(imagen10);
        jlImagenn10.setBounds(250,40,160,170);
   
        
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
        
        Image miIcono = miPantalla.getImage("src/main/java/Imagenes/Cuerda.png");
	setIconImage(miIcono);
        
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                cerrarVentana();
            }
        });
        
        
        //Verificar si la letra es correcta o no
        btnVerificar.addMouseListener(new MouseListener(){
            @Override
            public void mouseReleased(MouseEvent e) {

               
               if(!txtDigitar.getText().isEmpty()){
                   if(txtDigitar.getText().length() == 1){
                        Ahorcado.setLetra(txtDigitar.getText().toLowerCase());
                        Ahorcado.palabras();
                        imagenes();
                        jlPalabraOculta.setText(charToString(Ahorcado.palabraOculta));
                        txtDigitar.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null,
                    "Por favor ingrese una sola letra", 
                    " Error de Entrada de Dato",
                    JOptionPane.ERROR_MESSAGE);
                   }
                }
               else{
                   JOptionPane.showMessageDialog(null,
                    "Por favor ingrese una letra", 
                    " Error de Entrada de Dato",
                    JOptionPane.ERROR_MESSAGE);
               }
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
    
    // Colocar las imagenes del muñeco
    private void imagenes(){
         if(Ahorcado.intentos == 9){
            jlImagenn1.setVisible(true);
        }
        
        if(Ahorcado.intentos == 8){
            jlImagenn2.setVisible(true);
        }
        
        if(Ahorcado.intentos == 7){
            jlImagenn3.setVisible(true);
        }
        
        if(Ahorcado.intentos == 6){
            jlImagenn4.setVisible(true);
        }
        
        if(Ahorcado.intentos == 5){
            jlImagenn5.setVisible(true);
        }
        
        if(Ahorcado.intentos == 4){
            jlImagenn6.setVisible(true);
        }
        if(Ahorcado.intentos == 3){
            jlImagenn7.setVisible(true);
        }
        
        if(Ahorcado.intentos == 2){
            jlImagenn8.setVisible(true);
        }
        
        if(Ahorcado.intentos == 1){
            jlImagenn9.setVisible(true);
        }
        
        if(Ahorcado.intentos == 0){
            jlImagenn10.setVisible(true);
        }
        
        
        //---------
        if(Ahorcado.intentos == 9){
            jpContenido.add(jlImagenn1); 
        }
        
        if(Ahorcado.intentos == 8){
            jlImagenn1.setVisible(false);                          
             jpContenido.add(jlImagenn2); 
        }
        
        if(Ahorcado.intentos == 7){
             jlImagenn2.setVisible(false);                         
             jpContenido.add(jlImagenn3); 
        }
        
        if(Ahorcado.intentos == 6){
            jlImagenn3.setVisible(false);                        
            jpContenido.add(jlImagenn4); 
        }
        
        if(Ahorcado.intentos == 5){
            jlImagenn4.setVisible(false);
            jpContenido.add(jlImagenn5);
        }
        
        if(Ahorcado.intentos == 4){
            jlImagenn5.setVisible(false);                       
            jpContenido.add(jlImagenn6);
        }
        
        if(Ahorcado.intentos == 3){
            jlImagenn6.setVisible(false);                        
            jpContenido.add(jlImagenn7); 
        }
        
        if(Ahorcado.intentos == 2){
            jlImagenn7.setVisible(false);                        
            jpContenido.add(jlImagenn8); 
        }
        
        if(Ahorcado.intentos == 1){
            jlImagenn8.setVisible(false);                        
            jpContenido.add(jlImagenn9); 
        }
        
        if(Ahorcado.intentos == 0){
            jlImagenn9.setVisible(false);                        
            jpContenido.add(jlImagenn10); 
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
