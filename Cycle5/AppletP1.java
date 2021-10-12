/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author Student
 */
public class AppletP1 extends Applet {

    int x=300,y=100,r=50;
    public void paint(Graphics g) {
        g.drawLine(3,300, 200, 10);
        g.drawString("Line", 100, 100);
        g.drawOval(250, 50, 100, 100);
        g.drawRect(450, 50, 200, 100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
