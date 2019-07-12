/*7、创建类 GoodLuck 实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为
幸运会员*/
import java.util.Random;
public class Work7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("我行我素购物管理系统>幸运抽奖");
			System.out.println();
			System.out.println("请输入4位会员号：");
			int a = input.nextInt();
			int i = (int)(Math.random()*9+1);
			System.out.println(i);
			if(a/100%10==i){
				System.out.println(a+"号顾客是幸运顾客，获得大力耳光一个。");
			}else System.out.println(a+"号顾客,谢谢您的支持！");
		}
	}
}