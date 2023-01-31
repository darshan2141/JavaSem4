//Constructor Overloading
class A{
    A(){
        System.out.println("Default Constructor Call");
    }
    A(int i){
        System.out.println("parameterized Constructor Call");
        System.out.println("value is : "+i);
    }
}
class p3 {
    public static void main(String args[]) {
        A obj = new A();
        A obj1 = new A(Integer.parseInt(args[0]));
    }
}
