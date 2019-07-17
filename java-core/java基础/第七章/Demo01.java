/*
1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示语
		System.out.print("请输入1~10中的正整数：");
		int n = input.nextInt();
		if(n<1||n>10){
			System.out.print("您的输入有误，请重新输入：");
			n = input.nextInt();
		}
		//打印首部
		System.out.print(n+"!=");
		int b= 1;
		//循环打印
		for(;n>=1;n--){
			if(n>1){
				b*=n;
				System.out.print(n+"*");
			}
			if(n == 1){
				b*=n;
				System.out.print(n+"="+b);
			}
		}
	}
}