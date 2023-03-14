import java.awt.*;
import java.applet.*;

//<applet code="dem1" width="500" height="500"></applet>
public class dem1 extends Applet{

    public void paint(Graphics g){
        Dimension d = getSize();
        int X =(int) d.getWidth() / 2;
        int Y =(int) d.getHeight() / 2;

        g.drawString("Hello",X,Y);
    }
}
