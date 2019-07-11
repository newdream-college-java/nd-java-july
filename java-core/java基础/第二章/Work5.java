/*5、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。比如输入：
25，那么输出“1 天零 1 个小时”*/
import java.util.Scanner;
public class Work5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = input.nextInt();
		System.out.println(a/24+"天"+a%24+"个小时");
	}
}