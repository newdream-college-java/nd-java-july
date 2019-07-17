/*1、输入一个三位整数，判其是不是降序数如:531 是降序数 百位>十位>个位*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个三位整数：");
		int n=in.nextInt();
		int a,b,c;
		a=n%10;
		b=n/10%10;
		c=n/100;
		if(c>b&&b>a){
		System.out.println("该数是顺序数！！");
		}else System.out.println("该数不是顺序数！！");
			
	}
}