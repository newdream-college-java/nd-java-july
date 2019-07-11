/*1、输入一个三位整数，判其是不是降序数如:531 
是降序数 百位>十位>个位*/
import java.util.Scanner;
public class demo01{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个三位整数：");
		int a = input.nextInt();
		int gw=a%10;
		int sw=a/10%10;
		int bw=a/100%10;
		if((bw>sw)&&(sw>gw)){
			System.out.println("是降序数");
		}else{
			System.out.println("不是降序数");
		}
		
	}
}