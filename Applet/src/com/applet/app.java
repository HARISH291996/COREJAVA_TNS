package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class app extends Applet
{
	Button b;
	TextField t;
	public void init()
	{
		b=new Button("Submit");
		t=new TextField(10);
		add(b);
		add(t);
		
	}
}
