import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo5 extends Frame implements ActionListener
{
	Button[][]b;
	public ArrayDemo5()
	{
		setLayout(new GridLayout(3,3));
		b=new Button[3][3];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(Math.random()<0.5)
					add(b[i][j]=new Button("X"));
				else
					add(b[i][j]=new Button("O"));
				b[i][j].addActionListener(this);
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
		new ArrayDemo5();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o instanceof Button)
		{
			//Button b = (Button)o;
			//String s = b.getLabel();
			String c =((Button)o).getLabel();
			if(c.equals("X"))
				((Button) o).setLabel("O");
			else
				((Button) o).setLabel("X");
				
		}
	}
}
