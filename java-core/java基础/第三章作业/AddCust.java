/*、创建类 AddCust 录入会员信息,包括会员号、
生日和积分判断录入的会员号是否合法(必须为 4 位整数)  */

import java.util.Scanner;

public class AddCust{
	public static void main(String []  args){
	Scanner input=new Scanner(System.in);
	System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n\n");
	System.out.print("请输入会员号：");
	int x=input.nextInt();
	System.out.print("请输入会员生日：");
	String y=input.next();
	System.out.print("请输入积分：");
	int z=input.nextInt();
	if(!(x/1000==0)&&x/10000==0){
	System.out.println("已录入的会员信息是：");
	System.out.println(x+"\t"+y+"\t"+z);
	}else{
	System.out.println("会员号的格式错误！！");
	}
	} 
}