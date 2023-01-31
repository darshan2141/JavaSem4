class Ge{
    int i;
    void get(int i){
        this.i = i;
    }
}
class Sq extends Ge{
    void print(){
        int sq = i * i;
        System.out.println(sq);
    }
}
class Inhe{
    public static void main(String args[]){
        int i = Integer.parseInt(args[0]);
        Sq obj = new Sq();
        obj.get(i);
        obj.print();
    }
}