// Thread 

import java.util.*;

class exp{
    public static void main(String arg[]){
        Thread t1 = new Thread("A");
        t1.start();

        Thread t2 = new Thread("B");
        t2.start();

        System.out.println(t1);
        System.out.println(t2);
    }
}