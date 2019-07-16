/*2.1、商场对顾客的年龄层次进行调查,计算各年龄层次的顾客比例*/
import java.util.Scanner;
public class Work09{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double count=0;
		int i=0;
		for(;;i++){
			System.out.print("请输入第"+(i+1)+"位顾客的年龄(输入0结束)：");
			int a=sc.nextInt();
			if(a>=30){
				count++;
			}
			if(a==0){
				break;
			}
		}
		System.out.println("30岁以下的比例是："+(1-count/i)*100+"%");
		System.out.println("30岁以上的比例是："+count/i*100+"%");
	}
}