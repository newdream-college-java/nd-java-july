/*输入一个整数，代表有n个小时，计算n个小时等于多少天零多少个小时。比如输入：25，那么输出“1天零1个小时”*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数n：");
		int n=input.nextInt();
		int h=n/24;
		int m=n%24;
		System.out.println(h+"天零"+m+"个小时");
	}
}