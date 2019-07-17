/*
s输出空心菱形
*/

public class Work8 {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			if(i<=3){
 				for(int j=1;j<=n-i;j++) { 		//上		
					System.out.print(" ");
				}
			}else{
				for(int j = 1; j<i ; j++ ){		//下
					System.out.print(" ");
				}
			}
			for (int k = 1; k <= 2*i-1; k  ++) { 	
				if(k>n){
					continue;
				}else if(i==1||i==n/2+1) { 
   					System.out.print("*");
  				}else if(k==1||k==2*i-1) { 
   					System.out.print("*");
   				}else if(k==1 || k==2*(n-i)+1){ 	
   					System.out.print("*");
  				}else{
					System.out.print(" ");
				}
  			}
  			System.out.println(); 
		}
 	}
}