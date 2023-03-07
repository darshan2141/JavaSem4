// Thread using Interface
class T implements Runnable{
    public void run(){
        System.out.println("Thread");
    }
}

class exp{
    public static void main(String arg[]){
        T t1 = new T();
        t1.run();
    }
}