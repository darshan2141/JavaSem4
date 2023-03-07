package exam;

public class exam{
    int no;
    String nm;
    double p;

    public exam(){
        System.out.println("Welcome");
    }

    public exam(int no,String nm,double p){
        this.no = no;
        this.nm = nm;
        this.p = p;
    }

    public void print(){
        System.out.println("No : "+no);
        System.out.println("Name : "+nm);
        System.out.println("Percentage : "+p);
    }
}