/*2.2、韩嫣参加计算机编程大赛 如果获得第 1 名，将参加麻省理工大学组织的 1 个月夏令营 如果获得第 2 名，将奖励惠普笔记本电脑一部 如果获得第 3 名，将奖励移动硬盘一个 否则，不给任何奖励*/
import java.util.Scanner;
public class Work3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入名次");
		int a = sc.nextInt();
		switch(a){
			case 1:
				System.out.println("将参加麻省理工大学组织的一个月夏令营");
				break;
			case 2:
				System.out.println("将奖励惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("第将奖励移动硬盘一个");
				break;
			default:
				System.out.println("未获奖！");
				break;
		}
	}
}