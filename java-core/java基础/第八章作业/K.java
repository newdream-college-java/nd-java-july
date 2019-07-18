
/*
           打印如下图形
	    *
	  *  *
	 *    *
	*******
	 *    *
	  *  *
	    *
*/


public class D{
	public static void main(String [ ] args){
		int kg=3,xx=1,hs=7;
		for(int i=1;i<=hs;i++){
			//先打kg个空格
			for(int j=kg;j>0;j--){
				System.out.print(" ");
			}
			//再打xx个*
			for(int j=1;j<=xx;j++){
				if(i==4){
					System.out.print("*");
				}else{
					 if(j==1||j==xx){
						System.out.print("*");
					}else 
						System.out.print(" ");
				}
			}
			//每循环一次就换行
			System.out.println();
			//对称
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