/*
   *****	先打3个空格 再打5个* 换行
  *****		先打2个空格 再打5个* 换行
 *****		先打1个空格 再打5个* 换行
*****		先打0个空格 再打5个* 换行
每次输出1个*。
*/
public class Demo03{
	public static void main(String[ ]args){
		int kg = 3;
		for(int i=1;i<5;i++){
			//1.先打kg个空格 
			for(int j=1;j<=kg;j++){
				System.out.print(" ");
			}
			//2.再打5个* 
			for(int j=1;j<6;j++){
				System.out.print("*");
			}
			//3,换行
			System.out.println();

			kg--;
		}
	}
}
