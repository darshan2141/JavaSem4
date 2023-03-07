import java.io.*;

class user{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter Name : ");
            String s = br.readLine();

            FileOutputStream fos = new FileOutputStream("abc.txt");

            fos.write(s.getBytes());

            System.out.println("Write");
            fos.close();
        }catch(Exception e){

        }
    }
}