//card Layout Example
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class demo extends JFrame implements ActionListener{
    CardLayout card;
    JButton b1,b2,b3;
    Container c;

    demo(){
        c = getContentPane();
        card = new CardLayout(40,40);

        c.setLayout(card);
        b1 = new JButton("BCA");
        b2 = new JButton("BSC IT");
        b3 = new JButton("BSC");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a",b1);
        c.add("b",b2);
        c.add("c",b3);
    }

    public void actionPerformed(ActionEvent e){
        card.next(c);
    }

    public static void main(String arg[]){
        demo c1 = new demo();
        c1.setSize(400,400);
        c1.setVisible(true);
        c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
