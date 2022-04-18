import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Appletmouse extends Applet
{
	public void init()
	{
		addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseMoved(MouseEvent e) {
					int x =e.getX();
					int y =e.getY();
					showStatus(String.valueOf(x)+ " ,, " +String.valueOf(y));
				}
	});
}
}