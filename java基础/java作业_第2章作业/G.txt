/*6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。
比 如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。 */
import java.util.Scanner;
public class G{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int s = input.nextInt();
		int  a = s/100%10;
		int b = s/10%10;
		int c = s%10;
		System.out.println("交换前：a="+a+"\tb="+b+"\tc="+c);
		int d=a;
		a=c;
		c=d;
		System.out.println("交换后：a="+a+"\tb="+b+"\tc="+c);
}
}