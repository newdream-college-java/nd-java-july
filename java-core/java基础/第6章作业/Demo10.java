/*循环录入3位会员信息，会员号合法，显示录入信息；否则显示录入失败*/
import java.util.*;
public class Demo10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（4位整数）：");
			int num=input.nextInt();
			if((num/1000)!=0&&num<10000){
				System.out.print("请输入会员生日(月/日<用两位整数表示>)：");
				String birth=input.next();
				System.out.print("请输入会员积分：");
				int jf=input.nextInt();
				System.out.println("您录入的会员信息是：");
				System.out.println(num+"\t"+birth+"\t"+jf);
			}else{
				System.out.println("录入失败！！！");
				break;
			}
			
		}
		
	}
}