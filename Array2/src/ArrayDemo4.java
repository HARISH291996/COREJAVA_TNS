import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo4 extends Frame
{
	Button[][]b;
	public ArrayDemo4()
	{
		setLayout(new GridLayout(3,3));
		b=new Button[3][3];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(Math.random()<2)
					add(b[i][j]=new Button("X"));
				else
					add(b[i][j]=new Button("O"));
			}
		}
		addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new ArrayDemo4();
	}
}
