/*1.6、编程实现一个简单的人与电脑的猜拳游戏软件。*/
import java.util.Scanner;
import java.util.Random;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i=0;
		int n=0;
		while(i<2&&n>-2){
			//人出拳
			System.out.println("请出拳:(0-石头，1-剪刀，2-布)");
			int ren=input.nextInt();
			switch(ren){
				case 0:
					System.out.println("人输入的是：石头");
					break;
				case 1:
					System.out.println("人输入的是：剪刀");
					break;
				case 2:
					System.out.println("人输入的是：布");
					break;
				default:
					while(!(ren==0||ren==1||ren==2)){
						System.out.println("请出重新输入:(0-石头，1-剪刀，2-布)");
						ren=input.nextInt();
					}
					break;
			}
			//电脑出拳
			int dn=rd.nextInt(3);
			System.out.println(dn);
			switch(dn){
				case 0:
				System.out.println("电脑输入的是：石头");
				break;
				case 1:
				System.out.println("电脑输入的是：剪刀");
				break;
				default:
				System.out.println("电脑输入的是：布");
				break;
			}
			//判断输赢
			if(ren-dn==-1||ren-dn==2){
				System.out.println("人赢");
				i++;
			}else if(ren-dn==0){
				System.out.println("平局");
			}else{
				System.out.println("电脑赢");
				n--;
			}
		}
		if(i==2){
			System.out.println("最终结果为人赢");
		}else{
			System.out.println("最终结果为电脑赢");
		}
	}
}