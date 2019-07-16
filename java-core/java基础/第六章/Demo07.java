/*
1.7、循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int n;
		do{
			System.out.print("请输入（输0结束）：");
			 n = input.nextInt();
			sum+=n;
		}while(n != 0);
		System.out.println("计算结果为："+sum);
	}
}