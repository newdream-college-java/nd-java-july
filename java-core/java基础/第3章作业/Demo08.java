/*创建类 AddCust 录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为
4 位整数)*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.print("请输入会员号（4位整数）：");
		int a=input.nextInt();
		if(a<1000||a>=10000||(a-a/1!=0)){
			System.out.println("输入的会员号格式不正确（4位整数）！");
		}
		System.out.print("请输入会员生日（用两位数表示）：");
		String b=input.next();
		int len=b.length();
		if(len!=5){
			System.out.println("输入的格式错误，格式为xx/xx！");
		}
		System.out.print("请输入积分：");
		int c=input.nextInt();
		System.out.println("已录入的会员信息是：");
		System.out.println(a+"\t"+b+"\t"+c);
		
	}
}