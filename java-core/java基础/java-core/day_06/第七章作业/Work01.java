/*1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误*/
import java.util.Scanner;
public class Work01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.print("请输入正整数（1-10）（输入-1结束程序）：");
			int sum=1;
			int a=sc.nextInt();
			if(a==-1){
				break;
			}
			else if (a<1||a>10){
				System.out.println("输入错误，请重新输入");
			}else {
				for(int i=1;i<=a;i++){
					sum*=i;
				}
				System.out.println(a+"的阶乘等于"+sum);
			}
			
		}
	}
}