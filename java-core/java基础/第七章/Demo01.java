/*
1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则
输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误
*/
import java.util.*;
public class Demo01{
	public static void main (String [] args){
		
		int n=1;
		while(true){
			Scanner input = new Scanner (System.in);
			System.out.print("请输入一个正整数(0-10)：");
			if(input.hasNextInt()){
				int a = input.nextInt();
				if(a<=10&&a>0){
					for(int i =1;i<=a;i++){
						n=n*i;
					}
					System.out.print(a+"的阶乘为："+n);
					System.exit(-1);
				}
				else{
					System.out.println("输入超出范围！");
				}
			}else{
				System.out.println("请输入正整数！！");
				//input.reset();
				
			}
		}

	}
}