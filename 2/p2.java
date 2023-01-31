class A{
    void print(){
        System.out.println("Method Call");
    }
    void print(int i){
        System.out.println("value is :"+i);
    }
}
class p2 {
      public static void main(String args[]){
         A obj = new A();
         obj.print();
         obj.print(10);
      }    
}
