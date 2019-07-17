/*
4.¥Ú”°Õº–Œ
******* 
 *****
  ***
   * 
*/
public class Demo09{
	public static void main(String [] args){
		for(int i =1;i<=4;i++){
			for(int j=2*i;j<=8;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			for(int j =1;j<=i;j++){
				System.out.print(" ");
			}
		}
	}
}