//execption handling using try, catch, finally
import java.util.*;

class exp{
    public static void main(String arg[]){
        try{
            int p = Integer.parseInt(arg[0]);
            int n = Integer.parseInt(arg[1]);
            int i = p/n;
            System.out.println(i);
        }catch(ArithmeticException obj){
            System.out.println(obj);
            System.out.println("Not Possible");
        }catch(Exception e){
            System.out.println("Not write Wrong");
        }finally{
            System.out.println("call");
        }
    }
}