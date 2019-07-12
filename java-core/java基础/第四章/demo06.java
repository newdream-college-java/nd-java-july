/*2.5、 计算今年 1 月 1 日到今天的总天数。*/
import java.util.Scanner;
public class demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入今天的月份：");
		int iMouth=input.nextInt();
		System.out.println("输入今天的号数：");
		int iDay=input.nextInt();
		switch(iMouth){
			case 1:
			System.out.println("1月1号到今天的天数为："+(iDay-1));
			break;
			case 2:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31));
			break;
			case 3:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28));
			break;
			case 4:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31));
			break;
			case 5:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30));
			break;
			case 6:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31));
			break;
			case 7:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30));
			break;
			case 8:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30+31));
			break;
			case 9:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30+31+31));
			break;
			case 10:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30+31+31+30));
			break;
			case 11:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30+31+31+30+31));
			break;
			case 12:
			System.out.println("1月1号到今天的天数为："+(iDay-1+31+28+31+30+31+30+31+31+30+31+30));
			break;
			default:
			System.out.println("输入不合法");
		}
	}
}