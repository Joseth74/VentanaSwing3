
package ventana;
import javax.swing.*;
import javax.swing.event.*;
public class Ventanabox extends JFrame implements ChangeListener{
    private JCheckBox box1,box2,box3;
    
    public Ventanabox(){
    setLayout(null);
    box1 = new JCheckBox("Microsoft Edge");
    box1.setBounds(10,10,200,25);
    box1.addChangeListener(this);
    add(box1);
    
    box2 = new JCheckBox("Chrome");
    box2.setBounds(10,30,90,25);
    box2.addChangeListener(this);
    add(box2);
    
    box3 = new JCheckBox("Firefox");
    box3.setBounds(10,50,90,25);
    box3.addChangeListener(this);
    add(box3);
    }
    
    

    @Override
    public void stateChanged(ChangeEvent e) {
        String cad="";
        if(box1.isSelected()==true){
        cad=cad+"Microsoft Edge ";
        }
        if(box2.isSelected()==true){
        cad=cad+"Chrome ";
        }
        if(box3.isSelected()==true){
        cad=cad+"Firefox";
        }
        setTitle(cad);
    }
 
    
}
