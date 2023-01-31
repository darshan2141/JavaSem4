class p14{
	public static void main(String args[]){
			int i;
			int n = Integer.parseInt(args[0]);
			for(i=1; i <= n;i++){				
				for(int j=n; j >= i ;j--){
					System.out.print(j+" ");	
				}
				System.out.println();
			}
			for(i-= 1; i >= 1;i--){
				for(int j=n; j >= i ;j--){
					System.out.print(j+" ");	
				}
				System.out.println();				
			}
	}
}