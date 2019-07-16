/*	循环输入大于 0 的数字进行累加，
	直到输入的数字为 0，就结束循环，并最后输出累加的结果。
*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
		Scanner input =new Scanner(System.in);
		int a=input.nextInt();
		int sum=0;
		if(a<0){
			System.out.println("输入错误！！！");
			System.exit(-1);
		}
		while(a>=0){
			sum=sum+a;
			a=input.nextInt();
			if(a==0){
				System.out.println("你输入为0，退出循环");
				break;
			}
		}
		System.out.println("累加的结果为："+sum);
	}
}