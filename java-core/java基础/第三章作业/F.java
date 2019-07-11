/*、输入一个 int 型的数据，判断这个数是   否能被 2 整除，如果能被 2 整除， 
   那么输出“这个数是偶数”，否则输出“这个数是奇数”。 
   提示:8%2==0  10%2==0 
        9%2=1  */

import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
	Scanner input=new Scanner(System.in);
	int i=input.nextInt();
	if(i%2==0){
	System.out.println("这个数是偶数");
	}else{
	System.out.println("这个数是奇数");
	}
	}
}