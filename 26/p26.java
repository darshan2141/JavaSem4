//vector Program
import java.util.*;

class p26{
    public static void main(String arg[]){

        Vector v = new Vector();

        v.add("Happy");
        v.add("Holi");

        System.out.println(v.size());
        System.out.println(v);

        v.add("XYZ");
        v.add("ABC");

        System.out.println(v.size());

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.capacity());
    }
}
