
package ventana;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class VentanaRadio extends JFrame implements ActionListener  {
  private JTextField jtext1,jtext2;
  private ButtonGroup bg;
  private JRadioButton radio1,radio2;
  private JButton boton;
  private JLabel label;
  
    public VentanaRadio(){
    setLayout(null);
    
    bg = new ButtonGroup();
    radio1 = new JRadioButton("Sumar");
    radio1.setBounds(60,30,70,25);
    add(radio1);
    bg.add(radio1);
    radio2 = new JRadioButton("Restar");
    radio2.setBounds(60,60,70,25);
    add(radio2);
    bg.add(radio2);
    
    label = new JLabel("Sume o reste dos numeros:");
    label.setBounds(10,10,200,25);
    add(label);
    
    jtext1 = new JTextField();
    jtext1.setBounds(10,30,50,25);
    jtext1.addActionListener(this);
    add(jtext1);
    jtext2 = new JTextField();
    jtext2.setBounds(10,60,50,25);
    jtext2.addActionListener(this);
    add(jtext2);
    
    boton = new JButton("Aceptar");
    boton.setBounds(160,100,90,25);
    add(boton);
    boton.addActionListener(this);
    }
    
    @Override
    public void  actionPerformed(ActionEvent e)  {
        if(e.getSource()==boton){
          int n1 = Integer.parseInt(jtext1.getText());
          int n2 = Integer.parseInt(jtext2.getText());
          int Resultado=0;
          
          if (radio1.isSelected()){
          Resultado = n1+n2;
          }
          if(radio2.isSelected()){
          Resultado = n1-n2;
          }
            setTitle(String.valueOf(Resultado));
            
        }
    }
    
}
