/*、编程实现一个简单的人与电脑的猜拳游戏软件
 */

import java.util.*;

public class F{
	public static void main(String[ ] args){
		int i=1,j=0,l=0;
		while(j<2){
			System.out.println("请选择你的猜拳：0.石头；1.剪刀；2.布");
			Scanner input=new Scanner(System.in);
			int a = input.nextInt();
			while(a>2){
				System.out.print("请重新输入：");
				a = input.nextInt();
			}
			switch(a){
				case 0:
					System.out.println("你的选择是石头");
					break;
				case 1:
					System.out.println("你的选择是剪刀");
					break;
				case 2:
					System.out.println("你的选择是布");
					break;
			}
			Random dn=new Random();
			int b =dn.nextInt(3);
			switch(b){
				case 0:
					System.out.println("电脑的选择是石头");
					break;
				case 1:
					System.out.println("电脑的选择是剪刀");
					break;
				case 2:
					System.out.println("电脑的选择是布");
					break;
			}
			System.out.println("第"+i+"回合");
			if(a-b==0){
				System.out.println("平局\n\n");
			}else if(a-b==2||b-a==1){
				System.out.println("你获胜\n\n");
				i++;
				j++;
				if(j==2)
				System.out.println("三局两胜的结果是你获胜");
			}else{
				System.out.println("电脑获胜\n\n");
				i++;
				l++;
				if(l==2)
				System.out.println("三局两胜的结果是电脑获胜");
			}
		}
	}
}