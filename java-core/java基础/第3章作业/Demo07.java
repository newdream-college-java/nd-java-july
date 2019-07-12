/*创建类 GoodLuck 实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为
幸运会员*/
import java.util.Scanner;
import java.lang.Math;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.print("请输入4位会员号");
		int a=input.nextInt();
		int x=(int)(Math.random()*10);
		System.out.println("生成的随机数为:"+x);
		if(x==a/1000){
			System.out.println(a+"号客户是幸运客户，获得精美MP3一个");
		}else{
			System.out.println(a+"号客户，谢谢您的支持");
		}
	}
}