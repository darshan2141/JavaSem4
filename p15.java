class p15{
	public static void main(String args[]){
			int i;
			int n = Integer.parseInt(args[0]);
			for(i=1; i <= n;i++){				
				for(int j= 1; j <= i ;j++){
                    if(j % 2 != 0)
					    System.out.print(1+" ");
                    else    	
                        System.out.print(2+" ");
				}
				System.out.println();
			}
			for(i-= 2; i >= 1;i--){
				for(int j= 1; j <= i ;j++){
                    if(j % 2 != 0)
					    System.out.print(1+" ");
                    else    	
                        System.out.print(2+" ");
				}
				System.out.println();				
			}
	}
}