import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//8、创建类 AddCust 录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为4 位整数)
		System.out.println("超级大机霸购物管理系统 > 客户信息管理 > 添加客户信息\t");
		System.out.print("请输入会员号(<4位整数>)：");
		int userName=input.nextInt();
		if(userName<=1000||userName>=10000){
			System.out.print("请输入会员号(<4位整数>)");
			return;
		}
		System.out.print("请输入会员生日(月/日<用两位数表示>)：");
		String birthday=input.next();
		if(birthday.indexOf("/")==-1){
			System.out.print("请输入(月/日<用两位数表示>)");
			return;
		}
		System.out.print("请输入积分：");
		int intergral=input.nextInt();
		System.out.println("已录入的会员信息是：");
		System.out.println("会员号\t会员生日\t积分");
		System.out.println(userName+"\t"+birthday+"\t\t"+intergral);
	}
}

