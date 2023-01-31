class Animal{
    void print(){
        System.out.println("Base Class");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class Inhe{
    public static void main(String args[]){
        Dog obj = new Dog();
        obj.print();
        obj.bark();
    }
}