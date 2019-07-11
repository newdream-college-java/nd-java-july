/*6、输入一个 3 位数，分别放入到 3 个变量中去
，编程将这 3 个变量中的值交换后输出。比如输入
 123 三个数放入到 a,b,c 中去，最后输出a,b,c 的值
，要求输出 321。*/
import java.util.Scanner;
public class demo06{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三位数：");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int tmp;
		if(a<b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a<c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b<c){
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println("三位数分别为：a="+a+"b="+b+"c="+c);
	}
}