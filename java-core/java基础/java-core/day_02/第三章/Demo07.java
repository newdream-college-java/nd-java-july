/*7、创建类GoodLuck实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员*/
import java.util.*;
public class Demo07{
	public static void main(String [] args){
		System.out.println("我行我素购物管理系统>幸运抽奖");
		Scanner input=new Scanner(System.in);
		System.out.print("请输入4位会员号：");
		int n=input.nextInt();
		int m=(int)(Math.random()*9+0);
		if(n==m){
			System.out.println(n+"号是幸运客户，获得宾利一辆！！！");
		}else {
			System.out.println(n+"号客户，谢谢你的支持！！！");
		} 
	}
}