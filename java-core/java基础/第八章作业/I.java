/*
	打印如下图形
                   *******
	    *****
	     ***
 	      *
*/

public class I{
	public static void main(String[ ] args){
		int a=7;  //定义*的长度
		//循环打印4排
		for(int i=0;i<4;i++){
			//j根据a和i的值来判断打印多少个*
			for(int j=a;j>i;j--){
				System.out.print("*");
			}
			a=a-1;
			System.out.println();
			//根据行数来决定打印多少个空格
			for(int j=i;j>=0;j--){
				System.out.print(" ");
			}
		}
	}	
}