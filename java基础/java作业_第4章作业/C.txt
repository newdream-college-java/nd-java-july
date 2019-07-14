import java.util.Scanner;
public class C{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入获得的名次：");
		int a = input.nextInt();
		switch(a)
		{
		case 1:
		System.out.println("恭喜、你获得参加麻省理工大学组织的1个月夏令营！");
		break;
		case 2:
		System.out.println("恭喜、你获得惠普笔记本电脑一部！");
		break;
		case 3:
		System.out.println("恭喜、你获得移动硬盘一个！");
		break;
		default :
		System.out.println("抱歉、你没有奖励！");
		}
}
}