/*6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个三位数：");
		int n=in.nextInt();
		int a,b,c;
		a=n%10;
		b=n/10%10;
		c=n/100;
		System.out.println(a+""+b+""+c);	
	}
}