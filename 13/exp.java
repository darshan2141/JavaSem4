import java.io.*;

class exp{
    public static void main(String arg[]){
        try{
            RandomAccessFile raf = new RandomAccessFile("ABC.txt","r");
            raf.seek(1);

            System.out.println((char)raf.read());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}