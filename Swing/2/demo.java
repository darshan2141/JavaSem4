//Layout is class manage by LayoutManager from awt pkg 
//Layout is use to Arrange Componets
//FlowLayout direction is Left ot Right
//frameObj.setLayout(obj); method use to set Layout 

import java.awt.*;
import javax.swing.*;

public class demo extends JFrame{
    JFrame f;
    JButton b1,b2,b3,b4,b5;
    public demo(){
        f = new JFrame();
        FlowLayout f1 = new FlowLayout();//FlowLayout
        f.setLayout(f1);
        b1 = new JButton("East");
        b2 = new JButton("West");
        b3 = new JButton("South");
        b4 = new JButton("North");
        b5 = new JButton("Center");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.setSize(400,300);
        f.setVisible(true);
    }

    public static void main(String arg[]){
        new demo();
    }
}

