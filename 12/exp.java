import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Enter Source File Name : ");
            String fnms = br.readLine();

            System.out.print("Enter Destination File Name : ");
            String fnmd = br.readLine();

            FileInputStream fis = new FileInputStream(fnms);
            FileOutputStream fos = new FileOutputStream(fnmd);

            int i;
            while((i = fis.read()) != -1){
                fos.write(i);
            }
            System.out.println("File Copied");
            fis.close();
            fos.close();
        }catch(Exception e){

        }
    }
}