/*1、输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位*/
import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三位数的整数：\t");
		int x = input.nextInt();
		int a = x%10;
		int b = x/10%10;
		int c = x/100%10;
		if(a<b&&b<c){
			System.out.println("是降序数");
		}else System.out.println("不是降序数");
	}
}