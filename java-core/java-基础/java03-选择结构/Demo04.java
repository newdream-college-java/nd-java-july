/*练习3：输入2个整数分别保存到变量a,b中，
然后编程实现交换a,b中的值，然后输出！*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//提示
		System.out.println("输入2个整数");
		int a = input.nextInt();//3
		int b = input.nextInt();//5
		System.out.println("交换前:a="+a+"\tb="+b);
		//交换方式一：中间变量
		/*int c ;
		c = a;
		a = b;
		b = c;*/
		//交换方式二：两数之和减去其中一个数，一定等于另一个数
		a = a +b ;//a=8 b=5
		b = a - b;//a=8  b=3
		a = a - b; //a=5 b=3

		System.out.println("交换后：a="+a+"\tb="+b);



	}
}