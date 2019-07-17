/*8、创建类AddCust录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为4位整数)*/
import java.util.*;
public class AddCust{
	public static void main(String[] args){
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息");
		System.out.println();
		Scanner input =new Scanner(System.in);
		System.out.print("请输入会员号（<4位整数>）：");
		int a=input.nextInt();
		System.out.print("请输入会员生日（月/日<用两位数表示>）：");
		int m=input.nextInt();
		int d=input.nextInt();
		System.out.print("请输入积分：");
		int s=input.nextInt();
		System.out.println();
		System.out.println("已录入的会员信息是：");
		System.out.println(a+"\t"+m+"/"+d+"\t"+s);
		
	}
}