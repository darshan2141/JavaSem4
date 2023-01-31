//eligible / parents permission / not eligible
import java.util.*;

class p9{
	public static void main(String args[]){

		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int age = obj.nextInt();
		
		if(age > 18){
			System.out.println("You are Eligible");
		}else if(age >= 16){
			System.out.println("You Get Parents Permission");			
		}else{
			System.out.println("You are Not Eligible");
		}
	}
}