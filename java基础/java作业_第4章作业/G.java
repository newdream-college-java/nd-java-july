import java.util.Scanner;
public class G{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = input.nextInt();
		System.out.println("请输入运算符：");
		String b = input.next();
		System.out.println("请输入第二个数：");
		int c = input.nextInt();
		int d;
		if (b.equals("+"))
		{
		d=a+c;
		System.out.println("计算的结果为："+d);
		}else if(b.equals("-"))
		{
		d=a-c;
		System.out.println("计算的结果为："+d);
		}else if(b.equals("*"))
		{
		d=a*c;
		System.out.println("计算的结果为："+d);
		}else if(b.equals("/"))
		{
		d=a/c;
		System.out.println("计算的结果为："+d);
		}else
		{
		System.out.println("请输入正确的运算符！");
		}
}
}