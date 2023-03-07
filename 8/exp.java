import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            String s = arg[0];
            FileOutputStream fos = new FileOutputStream("sss.txt");
            byte b[] = s.getBytes();

            fos.write(b);
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}