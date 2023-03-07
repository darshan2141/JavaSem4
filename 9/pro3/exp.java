import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);
            System.out.print("Enter File Name : ");
            String fn = br.readLine();

            FileOutputStream fos = new FileOutputStream(fn);

            for(int i = 65; i <= 97 ; i++){
                fos.write(i);
            }
            fos.close();
        }catch(Exception e){

        }
    }
}