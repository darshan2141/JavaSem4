// BufferedReader
import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter Name : ");
            String s = br.readLine();
            System.out.println(s);
        }catch(Exception e){
            
        }
    }
}