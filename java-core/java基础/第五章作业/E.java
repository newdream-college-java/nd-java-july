/*	循环要求用户输入一个0到2之间的整数，如果输入的是0就输出“你出的是石头”，
	如果输入的是1就输出“你出的是剪刀”，
	如果输入的是2就输出“你出的是布”， 
	如果是其它数就结束程序。

*/

import java.util.*;

public class E{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		while(i>=0&&i<=2){
			switch(i){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
					System.out.println("你出的是剪刀");
					break;
				case 2:
					System.out.println("你出的是布");
					break;
			}
		
			i=input.nextInt();
		}
		System.out.println("系统退出！！！");
		System.exit(0);
	}
}