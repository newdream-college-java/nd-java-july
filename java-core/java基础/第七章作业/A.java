/*	
	编程实现接收用户输入的正整数，输出该数的阶乘。
	例如：输入数据 4，则输出 4!=4*3*2*1=24。
	要求限制输入 1~10，否则提示错误
*/
import java.util.Scanner;

public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=1;
		System.out.print("请输入一个正整数：");
		int a=input.nextInt();
		if(a>=1&&a<=10){
		System.out.print(a+"!=");
		//使用循环，对a依此递减
		for(;a>=1;a--){
			sum=sum*a;
			System.out.print(a);
			//判断*和=的位置
			if(a!=1){
				System.out.print("*");
			}else{
				System.out.print("=");
			}
		}
		System.out.println(sum);
		}else{
			System.out.println("输入错误！！！");
		}
	}
}
	

	
