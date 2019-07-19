/*
   *		先打3个空格 再打1个* 换行
  ***		先打2个空格 再打3个* 换行
 *****		先打1个空格 再打5个* 换行
*******		先打0个空格 再打7个* 换行


   *		先打3个空格 再打1个* 换行
  * *		先打2个空格 第1列和最后1列打* 中间打空格 换行
 *   *		先打1个空格 第1列和最后1列打* 中间打空格 换行
*******		先打0个空格 再打7个* 换行




   *		 
  * *
 *   *
*******
 *   *
  * *
   *
*/
public class Demo04{
		public static void main(String[] args){
			int kg = 3;
			int xx = 1;
			for(int i=1;i<=4;i++){//i代表的是行数
				//先打kg个空格 
				for(int j=1;j<=kg;j++){//j代表列数
					System.out.print(" ");
				}

				//再打xx个* 
				for(int j=1;j<=xx;j++){//j代表列数
					//System.out.print("*");
					if(i==1||i==4){//第1行和第4行 不变 还是打*
						System.out.print("*");
					}else{
						//第1列和最后1列打* 中间打空格
						if(j==1||j==xx){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
				}
				//换行
				System.out.println();
				kg--;
				xx+=2;
			}
		}
}