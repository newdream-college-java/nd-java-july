import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//2.1、猴子去买桃，如果买 3 个以下，老板就不送桃，如果买 3 个到 5 个就再送一个桃，如果买 5 个以上就送 2 个桃，现在要求输入猴子的买桃数，最后输出到底买到了几个桃。
		System.out.println("输入买桃数：");
		int data=input.nextInt();
		if(data>=3&&data<=5){
			++data;
		}else if(data>5){
			data=data+2;
		}
		System.out.println("最后买到了"+data);
		System.out.println("*********************分割线*********************");
		//2.2、韩嫣参加计算机编程大赛
		//	如果获得第 1 名，将参加麻省理工大学组织的 1 个月夏令营
		//	如果获得第 2 名，将奖励惠普笔记本电脑一部
		//	如果获得第 3 名，将奖励移动硬盘一个
		//	否则，不给任何奖励
		System.out.println("请输入名次");
		data=input.nextInt();
		switch(data){
			case 1:
			System.out.println("第 1 名，将参加麻省理工大学组织的 1 个月夏令营");
			break;
			case 2:
			System.out.println("第 2 名，将奖励惠普笔记本电脑一部");
			break;
			case 3:
			System.out.println("第 3 名，将奖励移动硬盘一个");
			break;
			default:
			System.out.println("没有奖励");
			break;
		}
	}
}