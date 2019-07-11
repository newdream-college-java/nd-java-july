/*7、创建类 GoodLuck 实现幸运抽奖，抽奖规则：
会员号的百位数字等于产生的随机数字即为幸运会员*/
import java.util.Scanner;
import java.util.Random;
public class demo07{
	public static void main(String []args){
		Random r=new Random();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入4位会员号：");
		int a = input.nextInt();
		int b=r.nextInt(10);	
		System.out.println("产生的随机数为："+b);
		if((a/100%10)==b){
			System.out.println(a+"号客户是幸运客户，获得精美Mp3一个。");
		}else{
			System.out.println(a+"号客户,谢谢您的支持！");
		}
	}
}