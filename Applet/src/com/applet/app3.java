package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.TextField;

public class app3 extends Applet
{
	TextField t1,t2,t3;
	Label l1;
	Button b1;
	Button b2;
	public void init()
	{
		add(t1 = new TextField(5));
		add(l1 = new Label("SUM(+)"));
		add(t2 = new TextField(5));
		add(b1 = new Button("RESULT ="));
		add(t3 = new TextField(5));
		add(b2 = new Button("CLEAR"));
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(b1))
		{
			String s1 = t1.getText();
			int i = Integer.parseInt(s1);
			String s2 = t2.getText();
			int j = Integer.parseInt(s2);
			int k = i+j;
			String s3 = String.valueOf(k);
			t3.setText(s3);
		}
		
		if(e.target.equals(b2))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		return true;
	}
	
}