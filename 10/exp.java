// file input stream

import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter File Name : ");

            String fn = br.readLine();
            FileInputStream fos = new FileInputStream(fn);
            int i;

            //-1 means null
            while((i = fos.read())  != -1){
                System.out.println((char)i);
            }
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
