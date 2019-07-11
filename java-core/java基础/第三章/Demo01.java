/*
1、输入一个三位整数，判其是不是降序数如:531 是降序数  百位>十位>个位
*/
import java.util.*;
public class Demo01{
	public static void main(String [] args){
		System.out.print("请输入一个三位整数：");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x/100>x/10%10&&x/10%10>x%10)
		System.out.print("其是降序数");
		else
		System.out.print("其不是降序数");
	}
}