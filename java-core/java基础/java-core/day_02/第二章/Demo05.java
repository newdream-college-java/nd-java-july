/*5、输入一个整数，代表有 n 个小时，计算 n 个小时等于多少天零多少个小时。比如输入：25，那么输出“1 天零 1 个小时”*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入小时数：");
		int n=in.nextInt();
		int d,h;
		d=n/24;
		h=n%24;
		System.out.println(d+"天零" +h+"个小时");	
	}
}