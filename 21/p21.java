import java.util.*;
class p21{
    public static void main(String args[]){
        GregorianCalendar obj = new GregorianCalendar(2023,1,23,12,05);
        System.out.println(obj.get(Calendar.DATE));
        System.out.println(obj.get(Calendar.MONTH));
        System.out.println(obj.get(Calendar.YEAR));
        System.out.println(obj.get(Calendar.HOUR));
        System.out.println(obj.get(Calendar.MINUTE));
    }
}