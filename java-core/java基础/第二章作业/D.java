/*输入两个整数，放入到两个变量 a 与 b 中，编程将 a 与 b 中的值交换，输出。 */

public class D{
	public static void main (String[] args){
		int a=1,b=2,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);
	}
}