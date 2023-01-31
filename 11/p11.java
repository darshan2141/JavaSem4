class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        System.out.println("B");
    }
}
class C extends A{
    C(){
        System.out.println("C");
    }
}
class hieInhe{
    public static void main(String args[]){
        B obj1 = new B();
        C obj2 = new C();
    }
}