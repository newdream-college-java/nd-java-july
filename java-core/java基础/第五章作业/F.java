/*1.6、编程实现一个简单的人与电脑的猜拳游戏软件。*/
import java.util.*;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random r=new Random();
		int count=3,i=0,j=0;
		while(count1!=0){
			System.out.println("请输入你的选择：（0表示“石头”，1表示“剪刀”，2表示“布”）");
			int pers=input.nextInt();
			while(pers<0||pers>3){
				System.out.print("输入不正确！请重新输入：");
				pers=input.nextInt();
			}
			switch(pers){
				case 0:
					System.out.println("你输入的：石头");
					break;
				case 1:
					System.out.println("你输入的：剪刀");
					break;
				case 2:
					System.out.println("你输入的：布");
					break;
			}	
			int comp=r.nextInt(3);
			switch(comp){
				case 0:
					System.out.println("电脑输入的：石头");
					break;
				case 1:
					System.out.println("电脑输入的：剪刀");
					break;
				case 2:
					System.out.println("电脑输入的：布");
					break;
			}
			if(pers-comp==-1||pers-comp==2){
				count--;
				i++;
				System.out.println("你赢了！");
			}else if(pers-comp==0){
				System.out.println("平局！");
			}else{
				count--;
				j++;
				System.out.println("电脑赢！");
			}
		}
		if(i==2){
			System.out.println("你获得了最终的胜利！");
		}else if(j==2){
			System.out.println("电脑获得了最终的胜利！");
		}
	}
}