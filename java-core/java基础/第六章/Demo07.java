/*
1.7、循环输入大于 0 的数字进行累加，
直到输入的数字为 0，就结束循环，并最后输出累加的结果。
*/
import java.util.*;
public class Demo07{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int sum =0;
		while(true){
			System.out.print("请输入数：");
			double a = input.nextDouble();
			if(a>0){
				sum+=a;
			}
			else if (a==0){
				System.out.print("和为："+sum);
				break;
			}
			else {
				System.out.println("你是个憨憨");
			}
		}
	}
}