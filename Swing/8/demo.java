//click on cancel button close frame
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class demo extends JFrame implements ActionListener{
    JFrame f,f2;
    JButton ok,cancel;
    JLabel l;

    public demo(){
        f = new JFrame("Demo");
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        f2 = new JFrame("Frame 2");
        f2.setSize(300,300);
        f2.setLayout(new FlowLayout());
        
        ok = new JButton("Ok");
        ok.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        l = new JLabel("Hello");

        f.add(ok);
        f.add(cancel);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == ok){
            f2.setVisible(true);
            f2.add(l);
        }else{
            System.exit(0);
        }
    }

    public static void main(String arg[]){
        new demo();
    }
}