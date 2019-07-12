import java.util.Scanner;
public class E{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入3个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("交换前：a="+a+"\tb="+b+"\tc="+c);
		int tmp;
		if(a>c){
		tmp=a;
		a=c;
		c=tmp;
		}
		if(a>b){
		tmp=a;
		a=b;
		b=tmp;
		}
		if(b>c){
		tmp=b;
		b=c;
		c=tmp;
		}
		System.out.println("交换后：a="+a+"\tb="+b+"\tc="+c);
}
}
		
		