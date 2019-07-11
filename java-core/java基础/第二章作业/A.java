/*  输入两个小数，存入 a,b 中，编程实现 a 与 b 变量中的值交换， 
    最后输出 a 与 b 中的值。  */


public class A{
	public static void main(String[] args) {
		double a=1.1,b=2.2,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);
	}
}