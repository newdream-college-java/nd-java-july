import java.util.Scanner;
import java.util.Random;
public class A6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random  rd = new Random();
		int a;
		int i = 1;
		int c = 0;
		while (i<=3){
		System.out.println("输入0 出石头");
		System.out.println("输入1 出剪刀");
		System.out.println("输入2 出布");
		a = sc.nextInt();
		while(a<0 || a>2){
			System.out.print("请重新输入0~2之间的整数");
			a = sc.nextInt();
		}
		switch(a){
			case 0:
				System.out.print("你出的石头\t");
				break;
			case 1:
				System.out.print("你出的剪刀\t");
				break;
			case 2:
				System.out.print("你出的布\t");
				break;
		}
		int b = rd.nextInt(3);
		switch(b){
			case 0:
				System.out.print("电脑出的石头\t");
				break;
			case 1:
				System.out.print("电脑出的剪刀\t");
				break;
			case 2:
				System.out.print("电脑出的布\t");
				break;
		}
		switch(a-b){
			case -1:
				System.out.println("你赢了一局");
				i++;
				c++;
				break;
			case 0:
				System.out.println("平局");
				break;
			default:
				System.out.println("你输了一局");
				i++;
				break;
		}
		}
		if(c>=2){
			System.out.print("你赢了!");
		}else{
			System.out.print("你输了!");
		}		
	}
}