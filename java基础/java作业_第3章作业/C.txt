import java.util.Scanner;
public class C{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第1道数字密码：");
		int a = input.nextInt();
		if(a==123456789)
		{
		System.out.println("请输入第2道数字密码：");
		int b = input.nextInt();
		if(b==123456789)
		{
		System.out.println("恭喜拿到钱了！");
		}else
		{
		System.out.println("第2道密码错误!");
		}
		}else
		{
		System.out.println("第1道密码错误！");
		}
}
}