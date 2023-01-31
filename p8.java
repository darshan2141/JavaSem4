//18+ get a Licence else not eligible 
 
import java.util.*;

class p8{
	public static void main(String args[]){

		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter Your Age : ");
		int age = obj.nextInt();
		
		if(age >= 18){
			System.out.println("You Get Licence");
		}else{
			System.out.println("You are Not Eligible");
		}
	}
}