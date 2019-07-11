/*6、输入一个 3 位数，分别放入到 3 个变量中去，编程将这 3 个变量中的值交换后输出。比
如输入 123 三个数放入到 a,b,c 中去，最后输出 a,b,c 的值，要求输出 321。*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数a：");
		int a = input.nextInt();
		System.out.println("请输入第二个整数b：");
		int b = input.nextInt();
		System.out.println("请输入第三个整数c：");
		int c = input.nextInt();
		if(a<b){
			a = a+b;
			b = a-b;
			a = a-b;
		}
		if(a<c){
			a = a+c;
			c = a-c;
			a = a-c;
		}
		if(b<c){
			b = b+c;
			c = b-c;
			b = b-c;					
		}	
		System.out.println("a="+a+"\tb="+b+"\tc="+c);		
	}
}