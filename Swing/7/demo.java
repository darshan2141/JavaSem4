//click button to open new JFrame
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class demo extends JFrame implements ActionListener{
    JFrame f,f2;
    JButton b;
    JLabel l;

    public demo(){
        f = new JFrame("Demo");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        f2 = new JFrame("Frame 2");
        f2.setSize(300,300);
        f2.setLayout(new FlowLayout());
        

        b = new JButton("Ok");
        b.addActionListener(this);
        l = new JLabel("Hello");

        f.add(b);
    }

    public void actionPerformed(ActionEvent ae){
        f2.setVisible(true);
        f2.add(l);
    }

    public static void main(String arg[]){
        new demo();
    }
}