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
interface C{
    void methodC(); //abstract method
}
class D extends B implements C {
    //👇 write body part of abstract method declare as public 
    public void methodC(){
        System.out.println("Hello C");
    }

    void methodD(){
        System.out.println("Hello D");
    }
}
class interFace{
    public static void main(String args[]){
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}