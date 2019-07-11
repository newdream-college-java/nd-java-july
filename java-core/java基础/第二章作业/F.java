/*输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。
比 如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。 */

import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int a,b,c;
	c=n%10;
	a=n/100;
	b=a;
	a=c;
	c=b;
	b=n/10%10;
	System.out.println(a+""+b+""+c);
	}
}