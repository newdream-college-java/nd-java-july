public class Demo05{
	public static void main(String[] args){
		/*
		    *
		   * * 
          *   *
         *******
		  *   *
           * *
			*
		*/
		for(int i=1;i<=4;i++){
			if(i!=4){
				for(int k=i;k<4;k++){
					System.out.print(" ");
				}
			for(int j=1;j<=i*2-1;j++){
			if(j==i*2-1||j==1){
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			}
			}else{
				for(int k=0;k<7;k++){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int j=1;j<=4;j++){
			if(j!=1){
				for(int k=1;k<j;k++){
					System.out.print(" ");
				}
				for(int n=7;n>=j+j-1;n--){
					if(n==j*2-1||n==7){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}