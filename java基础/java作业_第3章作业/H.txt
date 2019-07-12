import java.util.Scanner;
public class H{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入会员号（<4位整数>）：");
		int a = input.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		int b = input.nextInt();
		System.out.print("请输入积分：");
		int c = input.nextInt();
		if(a>=1000 && a<10000){
		System.out.println("已录入的会员信息是：\n"+a+"\t"+b+"\t"+c);
		}else
		{
		System.out.println("输入的会员号不合法！");
		}
}
}
		