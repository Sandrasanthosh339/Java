import java.applet.Applet;
import java.applet.*;
import java.awt.*;


import java.applet.Applet;



public class HouseP4 extends Applet {

    
Color color=Color.blue;
     public void paint(Graphics g)
{

int [] xCoords = { 40, 250, 460 };
int [] yCoords = { 200, 50, 200 };

super.paint(g);

g.drawRect(80, 200, 330, 260);
g.drawPolygon(xCoords , yCoords , 3);

g.setColor(this.color);
g.fillRect(190, 330, 100, 130);
}
}
