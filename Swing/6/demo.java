//Button Click Event
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class demo extends JFrame implements ActionListener{
    JFrame f;
    JButton b;
    JLabel l;

    public demo(){
        f = new JFrame("Demo");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        b = new JButton("Ok");
        b.addActionListener(this);
        l = new JLabel("Hello");

        f.add(b);
    }

    public void actionPerformed(ActionEvent ae){
        f.add(l);
    }

    public static void main(String arg[]){
        new demo();
    }
}
