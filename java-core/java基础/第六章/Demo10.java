/*2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败*/
import java.util.*;
public class Demo10{
	public static void main(String [] args ){
		Scanner input=new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("MyShopping管理系统 > 客户信息管理 > 添加客户信息");
		System.out.println("");
		System.out.println("");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号(<四位整数>) :");
			int number=input.nextInt();
			if(number<1000||number>9999){
				System.out.println("录入失败！请重新输入");
				i--;
				continue;
			}
			System.out.print("请输入会员生日(月/日<用两位整数表示>) :");
			String birthday=input.next();
			System.out.print("请输入会员积分:");
			int jf=input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println(number+"  "+birthday+"  "+jf);
			System.out.println("");
			System.out.println("");
		}
		System.out.println("程序结束！");
	}
}