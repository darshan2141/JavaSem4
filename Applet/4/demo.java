import java.awt.*;
import java.applet.*;
//<applet code="demo" width="500" height="500"></applet>
public class demo extends Applet{
    Image pic;
    public void init(){
        pic = getImage(getDocumentBase(),"demoImg.jpg"/*img path*/);
    }
    public void paint(Graphics g){
        g.drawImage(pic,10,10,this);
    }
}