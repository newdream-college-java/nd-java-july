/*使用程序解决现实生活中的问题

猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个
桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到
了几个桃。
 */

import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("猴子要买几个桃子：");
		int x=input.nextInt();
		if(x<3)
		{
			System.out.println("老板不送桃");
		}
		else if(x>=3&&x<=5)
		{
			System.out.println("老板送一个桃");
		}
		else
		{
			System.out.println("老板送二个桃");
		}
	
	}
}