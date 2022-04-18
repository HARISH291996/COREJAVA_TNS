import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mous extends Applet implements MouseListener,MouseMotionListener    
 {    
  public void init()    
  {    
   addMouseListener(this);    
   addMouseMotionListener(this);    
  }    
    
  public void mouseClicked(MouseEvent e)    
   {    
    showStatus("mouse clicked : "+e.getX()+","+e.getY());    
   }    
     
  public void mouseEntered(MouseEvent e)    
   {    
    showStatus("mouse entered : "+e.getX()+","+e.getY());    
     for(int i=0;i<10;i++);    
   }    
    
  public void mouseExited(MouseEvent e)    
   {    
    showStatus("mouse exited : "+e.getX()+","+e.getY());    
   }    
    
  public void mousePressed(MouseEvent e)    
   {    
    showStatus("mouse pressed : "+e.getX()+","+e.getY());    
   }    
    
  public void mouseReleased(MouseEvent e)    
   {       
    showStatus("mouse released : "+e.getX()+","+e.getY());    
   }    
    
  public void mouseMoved(MouseEvent e)    
   {    
    showStatus("mouse moved : "+e.getX()+","+e.getY());    
   }    
    
  public void mouseDragged(MouseEvent e)    
   {    
    showStatus("mouse dragged : "+e.getX()+","+e.getY());    
   }    
}       
  