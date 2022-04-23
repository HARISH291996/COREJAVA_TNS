package com.array;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ArrayDemo extends Frame
{
	int[] x;
	int[] y;
	int i;
	public ArrayDemo()
	{
		x=new int[10];
		y=new int[10];
		for(i=0;i<x.length;i++)
		{
			x[i]=(int)(400*Math.random());
			y[i]=(int)(400*Math.random());
		}
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(30,300);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,5);
	}
	public static void main(String args[])
	{
		new ArrayDemo();
	}
}
