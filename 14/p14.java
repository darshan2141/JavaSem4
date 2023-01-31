interface demo{
    public void show();
}
class B implements demo{
    public void show(){
        System.out.println("Hello");
    } 
}
class intFace{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}