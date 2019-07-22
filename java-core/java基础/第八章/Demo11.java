/*打印如下图形
6.    
        *
      *  *
     *     *
    *******
     *    *
      *  *
        *
*/
public class Demo11{
	public static void main(String [] args){
		int n=0;
		int a=0;
		int m=14;
		for(int i=7;i>=1;i--){
			n+=2;
			m-=2;
			a++;
			System.out.println("");
			if(i>=4){
				for(int k=4;k<i;k++){
					System.out.print(" ");
				}
				for(int j=1;j<n;j++){
					if(i==4){
						System.out.print("*");
					}else if(j==1||j==n-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}else{
				for(int k=a;k>=5;k--){
					System.out.print(" ");
				}
				for(int j=1;j<=m+1;j++){
					if(j==1||j==m+1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}	
			}
		}
	}
}