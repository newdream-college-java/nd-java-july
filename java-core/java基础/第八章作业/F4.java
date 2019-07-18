/*
4. 
*******
 *****
  ***
   *
*/
public class F4{
	public static void main(String[] args){
		int kg=3;
		int xx=1;
		for(int i=1;i<=4;i++){
			//´òÓ¡¿Õ¸ñ
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			//´òÓ¡*
			for(int j=1;j<=xx;j++){
				System.out.print("*");
			}
			System.out.println();
		kg--;
		xx+=2;
		}
	}
}