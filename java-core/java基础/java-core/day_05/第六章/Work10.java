/*2.2、循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败*/
import java.util.Scanner;
public class Work10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			int num=sc.nextInt();
			System.out.print("请输入会员生日（月/日<用2位整数表示>）：");
			int birthdayMonth=sc.nextInt();
			System.out.print("/");
			int birthday=sc.nextInt();
			System.out.print("请输入会员积分(<一个整数>)：");
			int score=sc.nextInt();
			if(num>=1000&&num<=9999){
				System.out.println("您录入的会员信息是：\n"+num+"\t"+birthdayMonth+"/"+birthday+"\t"+score);
				
			}else {
				System.out.println("信息错误,录入失败");
			}
		}
	}
}