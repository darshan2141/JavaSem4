class No{
    int i;
    void get(int i){
        this.i = i;
    }
}
class Square extends No{
    void Sq(){
        System.out.println("Square is : "+ i * i);
    }
}
class Cube extends No{
    void Cub(){
        System.out.println("Cube is : "+ i * i * i);
    }
}
class hieInhe{
    public static void main(String args[]){
       Square obj1 = new Square();
       Cube obj2 = new Cube();
       obj1.get(2);
       obj1.Sq();
       obj2.Cub();
    }
}