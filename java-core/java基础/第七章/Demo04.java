/*
1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果
*/
import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示语
		System.out.print("请输入一个整数（输999结束）：");
		int a = input.nextInt();
		int b = 0;
		int c = 0;
		int d = 0;
		while(a!=999){
			//判定输入的符号类型
			if(a==0){
				b++;
			}
			if(a>0){
				c++;
			}
			if(a<0){
				d++;
			}
			System.out.print("请继续输入     （输999结束）：");
			a = input.nextInt();
		}
		System.out.println("您输入了"+b+"个零、"+c+"个正数、"+d+"个负数。");
	}
}