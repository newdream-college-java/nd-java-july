import java.util.Scanner;
public class A{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int a = input.nextInt();
		int b = a/100%10;
		int s = a/10%10;
		int g = a%10;
		if(b>s&&s>g)
		{
		System.out.println(a+"是倒序数");
		}
		else{
		System.out.println(a+"不是倒序数");
		}
}
}
		
		