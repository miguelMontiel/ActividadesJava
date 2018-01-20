import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Globo extends Applet implements ActionListener
{
    private Button agrandar, reducir, moverDer, moverIzq, moverArriba, moverAbajo;
    private MiGlobo globito = new MiGlobo (50, 350, 50);
    
    public void init()
    {        
        agrandar = new Button("Agrandar");
        add(agrandar);
        agrandar.addActionListener(this);
        
        reducir = new Button("Reducir");
        add(reducir);
        reducir.addActionListener(this);
        
        moverDer = new Button("Mover Derecha");
        add(moverDer);
        moverDer.addActionListener(this);
        
        moverIzq = new Button("Mover Izquierda");
        add(moverIzq);
        moverIzq.addActionListener(this);
        
        moverArriba = new Button("Mover Arriba");
        add(moverArriba);
        moverArriba.addActionListener(this);
        
        moverAbajo = new Button("Mover Abajo");
        add(moverAbajo);
        moverAbajo.addActionListener(this);
        
        globito.automatico();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == agrandar)
        {
            globito.cambiarTam(20);   //llamada al método de la clase Globo
        }
        if(e.getSource() == reducir)
        {
            globito.cambiarTam(-20);  //llamada al método de la clase globo
        }
        if(e.getSource() == moverDer)
        {
            globito.desplazarDer();
        }
        if(e.getSource() == moverIzq)
        {
            globito.desplazarIzq();
        }
        if(e.getSource() == moverArriba)
        {
            globito.desplazarArriba();
        }
        if(e.getSource() == moverAbajo)
        {
            globito.desplazarAbajo();
        }
       
        repaint();
    }
    
    public void paint(Graphics g)
    {
        globito.mostrar(g);   //llamada al método de la clase Globo
    }
}

class MiGlobo
{
    //variables de instancia de esta clase
    private int diametro, xCoord, yCoord;
  
    //constructor de esta clase MIGlobo
    public MiGlobo(int diametroInicial, int xInicial, int yInicial)
    {
        diametro = diametroInicial;
        xCoord = xInicial;
        yCoord = yInicial;
    }

    //métodos de esta clase Globo
    public void mostrar (Graphics g)
    {
        g.setColor(Color.black);
        g.fillOval(xCoord, yCoord, diametro, diametro);
    }
    
    public void automatico()
    {
        xCoord++;
        if(xCoord == 1000)
        {
            xCoord--;
        }

    }
    
    public void cambiarTam(int cambio)
    {
        diametro = diametro + cambio;
    }
    public void desplazarDer ()
    {
        xCoord += 20;
    }
    public void desplazarIzq()
    {
        xCoord -= 20;
    }
    public void desplazarArriba()
    {
        yCoord -= 20;
    }
    public void desplazarAbajo()
    {
        yCoord += 20;
    }
}