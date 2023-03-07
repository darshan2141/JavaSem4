// get file name from user

import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            String s = arg[0];
            String s1 = arg[1];

            FileOutputStream fos = new FileOutputStream(s);
            byte b[] = s1.getBytes();

            fos.write(b);
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}