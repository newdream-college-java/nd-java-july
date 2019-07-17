/*1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
import java.util.*;
public class Demo04{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(true){
			System.out.print("请输入一个数字（输入999程序结束）：");
			int a=input.nextInt();
			if(a==999){
				break;
			}else if(a==0){
				sum1++;
			}else if(a>0){
				sum2++;
			}else{
				sum3++;
			}
		}
		System.out.println("正数的个数为："+sum2);
		System.out.println("负数的个数为："+sum3);
		System.out.println("0的个数为："+sum1);
	} 
}