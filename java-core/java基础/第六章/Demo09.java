/*
2.1、商场对顾客的年龄层次进行调查计算各年龄层次的顾客
*/
import java.util.Scanner;
public class Demo09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int old = 0;
		int young = 0;
		for(int i =1;i<=10;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int age = input.nextInt();
			if(age>30){
				old++;
				sum++;
			}
			if(age<30){
				young++;
				sum++;
			}
		}
		System.out.println("30岁以下的比例是："+(young*100.0/sum)+"%");
		System.out.println("30岁以上的比例是："+ (old*100.0/sum)+"%");
	}
}