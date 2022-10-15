
package vista;


//import java.awt.Image;
//import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




/**
 *
 * @author jeanp
 */
public class VentanaInicio extends JFrame {
    
    //private Header jpHeader;
    private JLabel jlNombrejuego;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private JButton btnParaquesirve;
    private JPanel jpContenido;

    
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
        
        //Toolkit miPantalla = Toolkit.getDefaultToolkit();
        
        //Configuracion del encabezado
        //jpHeader = new Header("/Imagenes/Cuerda.png");
        jpContenido = new JPanel();
        
        
        jlNombrejuego = new JLabel("AHORCADO");
        jlNombrejuego.setBounds(220,50, 500,20);
        
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(180,150, 150,50);
        btnInstrucciones = new JButton("Como Jugar");
        btnInstrucciones.setBounds(180,200, 150,50);
        btnParaquesirve = new JButton("Para que sirve");
        btnParaquesirve.setBounds(180,250, 150,50);
        

        
        jpContenido.setSize(500,500);        
        jpContenido.setBounds(0,110, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        //add(jpHeader);
        
        jpContenido.add(jlNombrejuego);
        jpContenido.add(btnJugar);
        jpContenido.add(btnInstrucciones);
        jpContenido.add(btnParaquesirve);
        
        ActionListener accion = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaJugador ventanajugador = new VentanaJugador();
                dispose(); 
            }       
        };
        
        btnJugar.addActionListener(accion);
        
        //Image miIcono = miPantalla.getImage("src/Imagenes/Cuerda.png");
	//setIconImage(miIcono);
    }
    
 

}