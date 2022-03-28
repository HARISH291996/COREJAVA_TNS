package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.TextField;

public class app1 extends Applet
{
	Button b1,b2;
	TextField t;
	public void init()
	{
		add(b1 = new Button("CLICK"));
		add(t = new TextField(10));
		add(b2 = new Button("CLEAR"));	
	}
	public boolean action(Event e, Object o)
	{
		if(e.target.equals(b1))
			t.setText("HELLO");
		if(e.target.equals(b2))
			t.setText("");
		return true;
	}
}
