/*2.5、 计算今年 1 月 1 日到今天的总天数。*/
import java.util.Scanner;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入月份：");
		int a = sc.nextInt();
		System.out.print("请输入日期：");
		int sum = sc.nextInt();
		switch(a){
			case 12:
				sum = sum+30;
			case 11:
				sum = sum+31;
			case 10:
				sum = sum+30;
			case 9:
				sum = sum+31;
			case 8:
				sum = sum+31;
			case 7:
				sum = sum+30;
			case 6:
				sum = sum+31;
			case 5:
				sum = sum+30;
			case 4:
				sum = sum+31;
			case 3:
				sum = sum+29;
			case 2:
				sum = sum+31;
			case 1:
				break;
			default:
				System.out.println("没有这个月份！");

		}
		System.out.print("天数为："+sum);
	}
}