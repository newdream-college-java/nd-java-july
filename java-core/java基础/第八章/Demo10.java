/*打印如下图形
4.5 *******
       *   *
        * *
         *
*/
public class Demo10{
	public static void main(String [] args){
		int n=0;
		for(int i=4;i>=1;i--){
			int sum=0;
			System.out.println("");
			n++;
			for(int k=1;k<n;k++){
				System.out.print(" ");
			}
			for(int m=1;m<i;m++){
				sum++;
			}
			for(int j=1;j<=i+sum;j++){
				if(i==4){
					System.out.print("*");
				}else if(j==1||j==i+sum){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
		}
	}
}