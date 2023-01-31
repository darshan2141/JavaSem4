class Sdemo{
    static int i;
    Sdemo(int i){
        this.i = i;
    }
    static void print(){
        System.out.println(i);
    }
}
class p4{
    public static void main(String args[]){
        Sdemo obj = new  Sdemo(10);
        Sdemo.print();
    }
}