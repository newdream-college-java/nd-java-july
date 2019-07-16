/*2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败*/
import java.util.Scanner;
public class Work10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int vip = sc.nextInt();
			if(vip>=9999||vip<=1000){
				System.out.println("录入失败");
				continue;
			}
			System.out.print("请输入会员生日（月/日<用2位整数表示>）：");
			String bd = sc.next();
			System.out.print("请输入会员积分：");
			int jf = sc.nextInt();			
			System.out.println("您录入的会员信息的是：");
			System.out.println(vip+" "+bd+" "+jf);
			System.out.println();
		} 
		System.out.println("程序结束！");
	}
}