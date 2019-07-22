/*打印如下图形
3.****
   ***
   **
   *
*/
public class Demo08{
	public static void main(String [] args){
		for(int i=4;i>=1;i--){
			System.out.println("");
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		}
	}
}