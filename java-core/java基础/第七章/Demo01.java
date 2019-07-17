/*1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误*/
import java.util.*;
public class Demo01{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("输入一个正整数（1-10）：");
		int a=input.nextInt();
		int b=1;
		if(a>=1&&a<=10){
			System.out.print(a+"!=");
			for(int i=a;i>=1;i--){
				b*=i;
				System.out.print(i+"*");
			}
			System.out.println("="+b);	
		}else{
			System.out.println("输入错误！！！");
		}
		
	}
}