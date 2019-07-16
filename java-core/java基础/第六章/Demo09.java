/*2.1、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例*/
import java.util.*;
public class Demo09{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"顾客年龄：");
			int yearsOld=input.nextInt();
			if(yearsOld>30){
				count++;
			}
		}
		System.out.println("30岁以下的比例是："+((10-count)/10.0*100)+"%");
		System.out.println("30岁以上的比例是："+(count/10.0*100)+"%");
	}
}