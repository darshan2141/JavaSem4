// thread using extends
// Dar vkhte static no lkye to pan chale
class T extends Thread{
    public void run(){
        for(int i = 1 ; i <= 5; i++){
            try{
                Thread.sleep(2000);
                System.out.println(i);
            }catch(Exception e){

            }
        }
    }
}

class exp{
    public static void main(String arg[]){
        T t1 = new T();
        T t2 = new T();

        t1.start();
        t2.start();
    }
}