/*创建类 GoodLuck 实现幸运抽奖，抽奖规则：
会员号的百位数字等于产生的随机数字即为 幸运会员  */

import java.util.Scanner;

public class GoodLuck{
	public static void main (String [] args){
	Scanner input=new Scanner(System.in);
	System.out.println("我行我素购物管理系统>幸运抽奖\n\n");
	System.out.print("请输入四位会员号：");
	int i=input.nextInt();
	int a=i/10%10;
	if(a==6){
	System.out.print(i+"号客户是幸运客户，获精美Mp3一个。");
	}else{
	System.out.print(i+"号客户，谢谢您的支持！");
	}
	}
}