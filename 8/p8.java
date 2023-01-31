//w.a.p to calculate cube using Inheritance and set a value from user
class Get{
    int i;
    void get(int i){
        this.i = i;
    }
}
class Cube extends Get{
    void printCube(){
        System.out.println("Cube is : "+(i*i*i) );
    }
}
class Inhe{
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        Cube obj = new Cube();
        obj.get(a);
        obj.printCube();
    }
}