/*7、创建类 GoodLuck 实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员*/
import java.util.*;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.print("请输入四位会员号：");
		int a=input.nextInt();
		int b=a/100%10;
		Random r=new Random();
		int c=Math.abs(r.nextInt())%10;
		//System.out.println(c);	
		if(b==c){
			System.out.println(a+"号客户是幸运客户，获得精美Mp3一个！");
		}else{
			System.out.println(a+"号客户，谢谢您的支持！");	
		}
		
	}
}