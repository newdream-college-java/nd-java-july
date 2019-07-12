/*
1、输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int n = input.nextInt();
		int a,b,c;
		a=n%10;
		n=(n-a)/10;
		b=n%10;
		n=(n-b)/10;
		c=n%10;
		
		if(a<b){
			if(b<c)
				System.out.println("这个数是降序数。");
		}
		else
			System.out.println("这个数不是降序数。");
	}
}