/*
2.1、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例
*/
import java.util.*;
public class Demo09{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("要输入多少位顾客：");
		int a = input.nextInt();
		double sum=0.0;
		for(int i=1;i<=a;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int b = input.nextInt();
			if(b<30){
				sum+=1;
			}
		}
		System.out.println("30岁以下的比例是："+sum/a*100+"%");
		System.out.println("30岁以上的比例是："+(100-(sum/a*100))+"%");
	}
}