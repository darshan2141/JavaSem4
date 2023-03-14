import java.awt.*;
import javax.swing.*;

public class demo extends JFrame{
    JFrame f;
    JButton b1,b2;
    public demo(){
        f = new JFrame();
        FlowLayout f1 = new FlowLayout();
        f.setLayout(f1);
        b1 = new JButton("OK");
        b2 = new JButton("CANCEL");
        f.add(b1);
        f.add(b2);
        f.setSize(400,300);
        f.setVisible(true);
    }

    public static void main(String arg[]){
        new demo();
    }
}