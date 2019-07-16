/*2.1、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例*/
import java.util.Scanner;
public class Work9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double up = 0;
		double down = 0;
		System.out.print("请输入顾客数量：");
		int a = sc.nextInt();
		for(int i =1;i<=a;i++){
			System.out.print("请输入第"+i+"位顾客的年龄：");
			int age = sc.nextInt();
			if(age<=30){
				down++;
			}else
				up++;
		}
		System.out.println("30岁以下的比例是："+down/a*100+"%");
		System.out.println("30岁以上的比例是："+up/a*100+"%");
	}
}
