package com.array;
import java.awt.*;
import javax.swing.*;
  
public class poly extends JApplet 
{
    public void init()
    {
        setSize(200, 200);
        show();
    }
    public void start()
    {
    }
    public void stop()
    {
    }
    public void paint(Graphics g)
    {
        // x coordinates
        int x[] = { 10, 30, 40, 50, 110, 140 };
        // y coordinates
        int y[] = { 140, 110, 50, 40, 30, 10 };
        int numberofpoints = 6;
        g.setColor(Color.blue);
        g.drawPolygon(x, y, numberofpoints);
    }
}