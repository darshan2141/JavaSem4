class A{
    void methodA(){
        System.out.println("Hello A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Hello B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Hello C");
    } 
}
interface D {
    void methodD();
}
class E extends C implements D{
    public void methodD(){
        System.out.println("Hello D");
    }

    void methodE(){
        System.out.println("Hello E");
    }
}

class interFace{
    public static void main(String args[]){
        E obj = new E();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
    }
}