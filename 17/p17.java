import java.util.*;
class stackCls{
    public static void main(String args[]){
        
        Stack obj = new Stack();

        obj.push(101);
        obj.push(102);
        obj.push(103);
        obj.push(104);
        obj.push(105);

        System.out.println(obj);
        System.out.println(obj.pop());
        System.out.println(obj);
    }
}