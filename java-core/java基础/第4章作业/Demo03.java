/*韩嫣参加计算机编程大赛
如果获得第 1 名，将参加麻省理工大学组织的 1 个月夏令营
如果获得第 2 名，将奖励惠普笔记本电脑一部
如果获得第 3 名，将奖励移动硬盘一个
否则，不给任何奖励*/
import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入韩嫣的成绩：");
		int a=input.nextInt();
		switch(a){
			case 1:	
			System.out.println("恭喜获得参加麻省理工大学组织的1个月夏令营活动！");
			break;
			case 2:
			System.out.println("恭喜获得惠普笔记本一台！");
			break;
			case 3:
			System.out.println("恭喜获得移动硬盘一个！");		
			break;
			default:
			System.out.println("恭喜没获奖！");
		}
	}
}