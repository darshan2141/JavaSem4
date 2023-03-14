import java.awt.*;
import java.applet.*;

// <applet code="Al" width=200 height=200 > </applet>

public class Al extends Applet{
    public void init(){
        System.out.println("init");
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}
