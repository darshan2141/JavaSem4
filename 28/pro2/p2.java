import exam.*;
import java.util.*;

class exp{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No : ");
        int no = sc.nextInt();

        System.out.print("Enter Name : ");
        String name = sc.next();

        System.out.print("Enter Percentage : ");
        double p = sc.nextDouble();

        exam obj = new exam(no,name,p);
        obj.print();
    }
}