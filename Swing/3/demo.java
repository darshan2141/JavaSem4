//Border Layout
import java.awt.*;
import javax.swing.*;

public class demo extends JFrame{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    public demo(){
        f = new JFrame();
        b1 = new JButton("East");
        b2 = new JButton("West");
        b3 = new JButton("South");
        b4 = new JButton("North");
        b5 = new JButton("Center");

        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b5,BorderLayout.SOUTH);
        f.add(b4,BorderLayout.CENTER);

        f.setSize(400,300);
        f.setVisible(true);
    }   
    public static void main(String arg[]){
        new demo();
    }
}
