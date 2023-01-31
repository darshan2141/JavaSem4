// get value from user useing cla( Command Line Argument )
class p11{
	public static void main(String args[]){
		int i = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);

		switch(i){
			case 1 : System.out.println(a + b);
			break;
			case 2 : System.out.println(a - b);
			break;
			default : System.out.println("Not Proper");
		}
	}	
}