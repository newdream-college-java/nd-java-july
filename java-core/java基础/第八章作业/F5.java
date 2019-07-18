/*
5. 
*******
 *     *
   * *
    *
*/
public class F5{
	public static void main(String[] args){
		int kg=3,xx=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=xx;j++){
				if(i==1||i==4){
					System.out.print("*");
				}else{
					if(j==1||j==xx){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}			
			}
			System.out.println();
			kg--;
			xx+=2;
		}
	} 
}