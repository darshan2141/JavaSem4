  class A{
    int i;
    A(){
        System.out.println("A.....");
    }
    void get(int i){
        this.i = i;
    }
}
class B extends A{
    B(){
        System.out.println("B......");
    }
    void sq(){
        System.out.println("Square : "+ i * i);
    }
}
class C extends B {
    C(){
        System.out.println("C......");
    }
    void cube(){
        System.out.println("Cube : "+ i * i * i);
    }
}
class mulInhe{
    public static void main(String args[]){
        int i = Integer.parseInt(args[0]);
        C obj = new C();
        obj.get(i);
        obj.sq();
        obj.cube();
    }
}