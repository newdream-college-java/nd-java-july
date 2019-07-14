/*2.2、韩嫣参加计算机编程大赛*/
import java.util.Scanner;
public class A2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入获得的名次:");
		int a = input.nextInt();
		switch(a){
			case 1:
			System.out.print("恭喜获得参加麻省理工大学组织的1个月夏令营的机会");
			break;
			case 2:
			System.out.print("获得惠普笔记本电脑一台");
			break;
			case 3:
			System.out.print("奖励移动硬盘一个");
			break;
			default:
			System.out.print("请下次再努力");
		}
	}
}