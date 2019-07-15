/*
1.6、编程实现一个简单的人与电脑的猜拳游戏软件
*/
import java.util.Scanner;
import java.util.Random;
public class Demo06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("************猜拳小游戏（三局两胜制）************");
		int m = 0;
		int n = 0;
		int j = 0;
		while(j<=2){
			System.out.print("请出拳（0：石头/1：剪刀/2：布）：");
			int a = sc.nextInt();
			//输入有误时
			while(a != 0&&a != 1&&a !=2){
				System.out.print("您的输入有误，请重新输入：");
				a = sc.nextInt();
			}
			//人出拳判断
			switch(a){
				case 0:		
					System.out.println("您出的是：石头。");
					break;
				case 1:
					System.out.println("您出的是：剪刀。");
					break;
				default :
					System.out.println("您出的是：布。");
					break;
				}
			
			//电脑出拳判断
			Random rd = new Random();
			int computer = rd.nextInt(3);
			if(computer == 0){
				System.out.println("电脑出的是：石头。");
			}
			if(computer == 1){
				System.out.println("电脑出的是：剪刀。");
			}
			if(computer == 2){
				System.out.println("电脑出的是：布");
			}

			//计分
			int g = a-computer;
			switch(g){
				case (-1):
				case 2:
					m++;
					System.out.println("当前你与电脑的比分为："+m+"："+n);
					break;
				case 0:
					System.out.println("当前你与电脑的比分为："+m+"："+n);
					break;
				default :
					n++;
					System.out.println("当前你与电脑的比分为："+m+"："+n);
					break;
				
			}
			j++;
		}
		//判断输赢
		if(m >n){
			System.out.println("恭喜你赢得了比赛！！！");
		}
		else if(m == n){
			System.out.println("不错，与电脑打成了平局！！！");
		}
		else{
			System.out.println("很遗憾，你输了这场比赛！！！");
		}
	}
}