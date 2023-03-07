import java.util.*;

class exp{
    public static void main(String arg[]){
        Thread t1 = new Thread();
        t1.start();

        Thread t2 = new Thread();
        t2.start();

        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setName("ABC");
        t2.setName("XYZ");

        System.out.println(t1.getName());
        System.out.println(t2.getName());

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}