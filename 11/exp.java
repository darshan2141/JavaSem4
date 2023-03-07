//error handling
import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Enter File Name : ");
            String fnm = br.readLine();

            File f = new File(fnm);

            if(!f.exists()){
                System.out.println("File does not exists");
            }else{
                FileInputStream fis = new FileInputStream(fnm);
                int i;
                while((i = fis.read()) != -1){
                    System.out.println((char)i);
                }
                fis.close();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}