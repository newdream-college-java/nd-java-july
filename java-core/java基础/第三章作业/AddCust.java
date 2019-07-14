/*8、创建类 AddCust 录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为4 位整数)*/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.print("请输入会员号（四位整数）：");
		int a=input.nextInt();
		if(a>999&&a<10000){
			System.out.print("请输入会员生日（月/日）：");
			String b=input.next();
			System.out.print("请输入积分：");
			int c=input.nextInt();
			System.out.println();
			System.out.println("已录入的会员信息是：");
			System.out.println(a+"\t"+b+"\t"+c);
		}else{
			System.out.println("会员号输入错误!");	
		}
	}
}