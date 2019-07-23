import java.util.Scanner;

/**实现显示真情回馈菜单
 * 
 * @author 肖康
 *
 */
public class CustMenu {
	public void showCustMenu(){
		System.out.println("\t我行我素购物管理系统>真情回馈");
		System.out.println("****************************");
		System.out.println("\t1.幸运大放送");
		System.out.println("\t2.幸运抽奖");
		System.out.println("\t3.生日问候");
		System.out.println("****************************");
		System.out.println("青玄子，输入数字0返回上一级菜单");
		Scanner input=new Scanner(System.in);
		int data=input.nextInt();
		if(data==1){
			System.out.println("执行幸运大放送");
		}else if(data==2){
			System.out.println("执行幸运抽奖");
		}else if(data==3){
		System.out.println("执行生日问候");
		}else if(data==0){
			MainMenu s=new MainMenu();
			s.showMainMenu();
		}else{
			System.exit(0);
		}
	}
}
