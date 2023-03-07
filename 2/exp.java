// throw

class Ex{
    void check(int age){
        if(age < 18){
            throw new ArithmeticException("Sorry");
        }else{
            System.out.println("Eligible");
        }
    } 
}

class exp{
    public static void main(String arg[]){
        int i = Integer.parseInt(arg[0]);
        Ex obj = new Ex();
        obj.check(i);
    }
}