/*
2.5、 计算今年 1 月 1 日到今天的总天数。
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = input.nextInt();
		System.out.print("请输入日期：");
		int day = input.nextInt();
		int sum;
		switch(month){
			case 1:
				if(day == 1){
					System.out.println("今天就是一月一日！！！");
				}
				else{
				sum = day - 1;
				System.out.println("距一月一日："+sum+"天！！！");
				}
				break;
			case 2:	
				sum = 31 + day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 3:	
				sum = 31 +28+ day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 4:	
				sum = 31 + 28+31+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 5:	
				sum = 31 + 28+31+30+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 6:	
				sum = 31 +28+31+30+31+ day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 7:	
				sum = 31 + 31 +28+31+30+31+30+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 8:	
				sum = 31 + 31 +28+31+30+31+30+31+ day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 9:	
				sum = 31 +  31 +28+31+30+31+30+31+ 31+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 10:	
				sum = 31 +  31 +28+31+30+31+30+31+ 31+30+ day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 11:	
				sum = 31 +   31 +28+31+30+31+30+31+ 31+30+31+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
			case 12:	
				sum = 31 +   31 +28+31+30+31+30+31+ 31+30+31+30+day -1;
				System.out.println("距一月一日："+sum+"天！！！");
				break;
				
			
		}

	}
}