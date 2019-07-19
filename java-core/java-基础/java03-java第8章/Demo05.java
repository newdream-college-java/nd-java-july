/*
   *		 
  * *
 *   *
*******
 *   *
  * *
   *

*/
public class Demo05{
	public static void main(String[] args){
		int kg = 3;
		int xx = 1;
		for(int i=1;i<=7;i++){
			//1.打空格
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			//2.打*
			for(int j=1;j<=xx;j++){
				if(i==1||i==4||i==7){
					System.out.print("*");
				}else{
					if(j==1||j==xx){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			//3.换行
			System.out.println();
			if(i<4){
				kg--;
				xx+=2;
				continue;
			}
			kg++;
			xx-=2;

		}
	}
}