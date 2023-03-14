//GridBag Layout
import java.awt.*;
import javax.swing.*;

public class demo extends JFrame{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField p1;
    JButton ok,cancel;

    public demo(){
        f = new JFrame("Login");
        GridBagLayout g = new GridBagLayout();
        f.setLayout(g);
        f.setSize(400,400);
        f.setVisible(true);

        l1 = new JLabel("User Name : ");
        t1 = new JTextField(10);
        l2 = new JLabel("Password :");
        p1 = new JPasswordField("ABCDE");

        ok = new JButton("Ok");
        cancel = new JButton("Cancel");

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p1);
        f.add(ok);
        f.add(cancel);
    }

    public static void main(String arg[]){
        new demo();
    }
}
