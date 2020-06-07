package ventana;

import java.awt.event.*;
import javax.swing.*;
public class Ventana extends JFrame implements ActionListener{
    private JTextField jtext1,jtext2;
    private JMenuBar menubar;
    private JMenu menu;
    private JMenuItem item,item2;
    private JLabel label1,label2,label3;
    
    
    public Ventana(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    menu = new JMenu("Opciones");
    menubar.add(menu);
    item = new JMenuItem("Redimensionar");
    menu.add(item);
    item.addActionListener(this);
    item2 = new JMenuItem("Finalizar Programa");
    menu.add(item2);
    item2.addActionListener(this);
    
    jtext1 = new JTextField();
    jtext1.setBounds(52,20,50,25);
    jtext1.addActionListener(this);
    add(jtext1);
    jtext2 = new JTextField();
    jtext2.setBounds(52,50,50,25);
    jtext2.addActionListener(this);
    add(jtext2);
    
    label1 = new JLabel("Ingrese el nuevo tamaño de ventana");
    label1.setBounds(10,0,250,25);
    add(label1);
    label2 = new JLabel("ALtura:");
    label2.setBounds(10,25,80,25);
    add(label2);
    label3 = new JLabel("Ancho:");
    label3.setBounds(10,55,80,25);
    add(label3);
    
}        

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item){
       int alto = Integer.parseInt(jtext1.getText());
       int ancho = Integer.parseInt(jtext2.getText());
        setSize(alto,ancho);
    }
        if(e.getSource()==item2){
        System.exit(0);
        }
    }
            public static void main(String [] args){
            Ventana v1 = new Ventana();
            
            v1.setLayout(null);
            v1.setBounds(150,230,300,200);
            v1.setVisible(true);
            v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
            Ventanabox v2 = new Ventanabox();
            
            v2.setLayout(null);
            v2.setBounds(0,0,300,200);
            v2.setVisible(true);
            v2.setLocationRelativeTo(null);
            v2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
            VentanaRadio v3 = new VentanaRadio();
            
            v3.setLayout(null);
            v3.setVisible(true);
            v3.setBounds(825,230,300,200);
            v2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }  
            
            
            
}
