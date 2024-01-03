import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class examen extends JFrame {

    public InterfazConBotones() {
        
        super("Interfaz con 4 botones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

       
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        JButton boton4 = new JButton("Botón 4");

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);

        
        add(panel);

        
        setVisible(true);
    }

    public static void main(String[] args) {
        
        InterfazConBotones interfaz = new InterfazConBotones();
    }
}