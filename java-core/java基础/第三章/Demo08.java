/*
8、创建类 AddCust 录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为 4 位整数
*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.println();
		System.out.print("请输入会员号（<4位整数>）：");
		int number = input.nextInt();
		if(number<1000||number>9999)
		System.out.println("输入的会员号不合法");
		else{
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		String birthday = input.next();
		System.out.print("请输入积分：");
		String jf = input.next();
		System.out.println();
		System.out.println("已录入的会员信息是：");
		System.out.print(number+"\t"+birthday+"\t"+jf);
		}

	}
}