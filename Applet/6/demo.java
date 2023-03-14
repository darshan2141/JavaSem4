import java.awt.*;
import java.applet.*;
//<applet code="demo" Width="500" Height="500"></applet>
public class demo extends Applet{
    Button b1;
    Button b2;

    public void init(){
        b1 = new Button("Ok");
        b2 = new Button("Cancel");
    }

    public void paint(Graphics g){
        add(b1);
        add(b2);
    }
}