import java.util.*;
class p22{
    public static void main(String args[]){
        GregorianCalendar obj = new GregorianCalendar();
        System.out.println(obj.get(Calendar.DATE));
        System.out.println(obj.get(Calendar.MONTH));
        System.out.println(obj.get(Calendar.YEAR));
        System.out.println(obj.get(Calendar.HOUR));
        System.out.println(obj.get(Calendar.MINUTE));
        System.out.println(obj.get(Calendar.SECOND));
    }
}