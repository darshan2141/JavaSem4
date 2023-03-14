import java.awt.*;
import java.applet.*;
//<applet code="demo" width="500" height="500"></applet>
public class demo extends Applet{
    public void paint(Graphics g){
        Dimension d = getSize();
        int X =(int)d.getWidth() / 2;
        int Y =(int)d.getHeight() / 2;
        Font f = new Font("Lucida Handwriting",Font.BOLD,30);
        g.setFont(f);
        g.setColor(Color.RED);
        g.drawString("Hello World",X,Y);
    }
}