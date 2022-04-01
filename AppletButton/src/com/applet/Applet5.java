package com.applet;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.TextField;

public class Applet5 extends Applet
{
	Checkbox c1,c2,c3,c4,c5,c6;
	TextField t;
	CheckboxGroup g1;
	
	public void init()
	{
		g1 = new CheckboxGroup();
		setLayout(new GridLayout(4,2));
		add (c1=new Checkbox("tour 1", g1, false));
		add (c2=new Checkbox("Place 1"));
		add (c3=new Checkbox("tour 2", g1, false));
		add (c4=new Checkbox("Place 2"));
		add (c5=new Checkbox("tour 3", g1, false));
		add (c6=new Checkbox("Place 3"));
		add (t=new TextField(8));
	}
}
