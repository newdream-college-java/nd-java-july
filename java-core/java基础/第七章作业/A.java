/*1.1、 编程实现接收用户输入的正整数，输出该数的阶乘。例如：输入数据 4，则输出 4!=4*3*2*1=24。要求限制输入 1~10，否则提示错误*/
import java.util.*;
public class A{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);//实例化扫描器
 		int a=input.nextInt();
		int sum=1;			//存储计算结果
		String s="";
		for(int i=1;i<=a;i++){		//求阶乘
			sum*=i;
		}
		for(int i=a-1;i>0;i--){		//输出计算过程
			s+=("*"+i);
		}
		System.out.println(a+"!="+a+s+"="+sum);
	}
}