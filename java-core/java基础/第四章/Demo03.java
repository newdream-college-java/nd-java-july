/*
【练习 2 】 训练要点 使用程序解决现实生活中的问题
2.2、韩嫣参加计算机编程大赛
如果获得第 1 名，将参加麻省理工大学组织的 1 个月夏令营
如果获得第 2 名，将奖励惠普笔记本电脑一部
如果获得第 3 名，将奖励移动硬盘一个
否则，不给任何奖励
*/
import java.util.*;
public class Demo03{
	public static void main (String [] args){
		System.out.println("请输入名次1-3：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		switch(number){
			case 1:
			System.out.println("将参加麻省理工大学组织的 1 个月夏令营");
			break;
			case 2:
			System.out.println("将奖励惠普笔记本电脑一部");
			break;
			case 3:
			System.out.println("将奖励移动硬盘一个");
			break;
			default:
			System.out.println("不给任何奖励");
		}
	}
}