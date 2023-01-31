import java.util.*;
class ranCls{
    public static void main(String args[]){
        Random obj = new Random();
        System.out.println(obj.nextLong());
        System.out.println(obj.nextBoolean());
        System.out.println(obj.nextInt());
        // System.out.println(obj.nextByte());
        System.out.println(obj.nextGaussian());
    }
}