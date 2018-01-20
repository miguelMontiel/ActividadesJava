import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class Mensaje extends Applet implements AdjustmentListener{
//variables de instancias 
    private Scrollbar BH, BV;
private int bh=20, bv=100; //desplazamiento en pixeles 

public void init(){
    BH= new Scrollbar(Scrollbar.HORIZONTAL,0,2,0,200);
    BV= new Scrollbar(Scrollbar.VERTICAL,0,2,0,200);
    
    
    setLayout (new FlowLayout ());
    
    //agregar controles (objetos) al liensio del applet (Objeto Graphics)
    add(BH);
    add(BV);
    
    //registrar auditor (escucha u oyete) de eventos
    BH.addAdjustmentListener(this);
    BV.addAdjustmentListener(this);
    
    
}

public void paint(Graphics w){
w.drawString("coordendas del mensaje en la ventana del Applet: "+ bh +"," + bv,BH.getValue(),BV.getValue());
BH.getValue();
BV.getValue();

}
//metodo abstracto 
public void adjustmentValueChanged(AdjustmentEvent e){
bh=BH.getValue();
bv=BV.getValue();
repaint();


}
}