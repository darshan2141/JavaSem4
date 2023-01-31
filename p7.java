import java.util.*;

class p7{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int a = obj.nextInt();
		if(a > 0){
			System.out.println(a+" is Positive Number");
		}else{
			System.out.println(a+" is Negative Number");			
		}
	}
}