/*输入一个四位数的整数，要求编程将这个四位数中的个位，十位，百位，千位分别输出。*/

public class C{
	public static void main(String[] args) {
		int i=1234;
		int a,b,c,d;
		a=i%10;
		b=i/10%10;
		c=i/100%10;
		d=i/1000;
		System.out.println("四位数的整数为："+i);
		System.out.println("个位\t十位\t百位\t千位");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}
}