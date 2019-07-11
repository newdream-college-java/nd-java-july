/*输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。比如输入：
25，那么输出“1 天零 1 个小时”
*/
import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数n：");
		int n = input.nextInt();
		int a = n%24;
		n=n-a;
		int d = n/24;
		System.out.println(d+"天零"+a+"个小时。");
	}
}