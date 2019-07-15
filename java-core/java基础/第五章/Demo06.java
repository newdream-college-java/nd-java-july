/*
1.6、编程实现一个简单的人与电脑的猜拳游戏软件
*/
import java.util.*;
public class Demo06 {
	public static void main(String[] args){
		System.out.println("请输入一个0-2的整数：0为石头，1为剪刀，2为布");
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		int a = input.nextInt();
		int sum1=0,sum2=0;
		while(true){
			while(a<0||a>2){
			System.out.println("输入错误!请重新输入：");
			a = input.nextInt();
			}
			switch(a){
				case 0:
					System.out.println("你出的是石头");
					break;
				case 1:
				System.out.println("你出的是剪刀");
				break;
				case 2:
					System.out.println("你出的是布");
					break;
				default:
					break;
			}
			int dn = rd.nextInt(3);
			switch(dn){
				case 0:
					System.out.println("电脑出的是石头");
					break;
				case 1:
					System.out.println("电脑出的是剪刀");
					break;
				case 2:
					System.out.println("电脑出的是布");
					break;
			}
			int result =a-dn;
			//判断输赢
			if(result==-1||result==2){
				System.out.println("恭喜你赢了一局！");
				sum1=sum1+1;
			}
			else if(result==0){
				System.out.println("平局");
			}
			else{
				System.out.println("电脑赢了一局！");
				sum2=sum2+1;
			}
			//三局两胜判断
			if(sum1<2){
				if(sum2<2){
					a = input.nextInt();
				}
				else{
					System.out.print("电脑赢得胜利！");
					System.exit(0);
				}
			}
			else{
				System.out.print("恭喜你赢得胜利！");
				System.exit(0);
			}
		}
			
	}
}