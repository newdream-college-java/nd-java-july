/*2.2、韩嫣参加计算机编程大赛 如果获得第 1 名，将参加麻省理工大学组织的 1 个月夏令营 如果获得第 2 名，将奖励惠普笔记本电脑一部 如果获得第 3 名，将奖励移动硬盘一个 否则，不给任何奖励*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		System.out.print("请输入你的名次：");
		Scanner input=new Scanner(System.in);
		int score = input.nextInt();
		switch(score)
		{
			case 1:
				System.out.println("恭喜你获得麻省理工大学组织的 1 个月夏令营");
				break;
			case 2:
				System.out.println("恭喜你获得惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("恭喜你获得移动硬盘一个。");
				break;
			default:
				System.out.println("你没中奖哦");
				break;
		}

	}	
}