//create our exception

class Invalid extends Exception{
    public Invalid(String str){
        super(str);
    }
}

class exp{

    static void validate(int age) throws Invalid{
        if(age < 18){
            throw new Invalid("Sorry");
        }else{
            System.out.println("Valid");
        }
    }   

    public static void main(String arg[]){
        try{
            int i = Integer.parseInt(arg[0]);
            validate(i);
        }catch(Invalid ie){
            System.out.println(ie);
        }
    }
}