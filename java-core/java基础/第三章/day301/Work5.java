/*输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数a：");
		int a = input.nextInt();
		System.out.println("请输入第二个整数b：");
		int b = input.nextInt();
		System.out.println("请输入第三个整数c：");
		int c = input.nextInt();
		if(a>b){
			a = a+b;
			b = a-b;
			a = a-b;
		}
		if(a>c){
			a = a+c;
			c = a-c;
			a = a-c;
		}
		if(b>c){
			b = b+c;
			c = b-c;
			b = b-c;					
		}	
		System.out.println("a="+a+"\tb="+b+"\tc="+c);
		
	}
}