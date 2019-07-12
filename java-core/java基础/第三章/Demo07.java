/*
7、创建类 GoodLuck 实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为
幸运会员
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运大抽奖");
		System.out.println("___________________________________");
		System.out.print("请输入4位会员号：");
		int n = input.nextInt();
		int a,b;
		b=n;
		a=b%10;
		b=(b-a)/10;
		a=b%10;
		b=(b-a)/10;
		a=b%10;
		int luck = 2;
		if(a == luck){
			System.out.println(n+"号客户是幸运客户，获得五三一套！！！");
		}
		else{
			System.out.println(n+"号客户，谢谢您的支持！！！");
		}
	}
}