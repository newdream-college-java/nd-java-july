/* 练习4：输入3个整数，分别保存到a,b,c3个变量中，
然后编程实现a>b>c?*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入3个整数");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("交换前:a="+a+"\tb="+b+"\tc="+c);
		//第1步：a与b比较  a<b 交换 ab 
		int tmp ;
		if(a<b){
			tmp = a;
			a= b;
			b=tmp;
		}
		//第2步：a与c比较  a<c 交换 ac 
		if(a<c){
			tmp = a;
			a= c;
			c= tmp;
		}
		//第3步：b与c比较  b<c 交换 bc
		if(b<c){
			tmp = b;
			b = c;
			c= tmp;
		}
		System.out.println("交换后：a="+a+"\tb="+b+"\tc="+c);
	}
}