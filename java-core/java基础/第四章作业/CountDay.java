/*2.5、 计算今年 1 月 1 日到今天的总天数。*/
import java.util.Scanner;
public class CountDay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入当前月份：");
		int a=input.nextInt();
		System.out.print("请输入当月天数：");
		int sum=input.nextInt();
		if(sum>0&&sum<32){
			switch(a){
 				case 12:
					sum+=30;
 				case 11:
					sum+=31;
 				case 10:
					sum+=30;
 				case 9:
					sum+=31;
 				case 8:
					sum+=31;
 				case 7:
					sum+=30;
 				case 6:
					sum+=31;
 				case 5:
					sum+=30;
 				case 4:
					sum+=31;
 				case 3:
					sum+=28;
 				case 2:
					sum+=31;
				case 1:
					break;
				default:
					System.out.println("月份输入有误！");
			}
			System.out.println("总天数为："+sum);
		}
		else{
			System.out.println("输入的天数有误！");
		}		
	}
}		