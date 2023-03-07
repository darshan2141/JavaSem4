//  hashtable
import java.util.*;

class exp{
    public static void main(String arg[]){
        Hashtable obj = new Hashtable();
        obj.put("101","ABC");
        obj.put("102","DEF");

        obj.remove("102");

        obj.put("103","GHI");
        obj.put("105","MNO");

        obj.get("105");

        System.out.println(obj);
    }
}