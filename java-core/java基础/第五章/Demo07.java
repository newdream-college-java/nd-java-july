/*1.7、 从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外
的值时，提示错误重新输入，直到输入 0 退出循环。
1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数(1-7):");
		int sr =input.nextInt();
		while(sr!=0){
			switch(sr){
				case 1:
					System.out.println("MON");
					break;
				case 2:
					System.out.println("TUE");
					break;
				case 3:
					System.out.println("WED");
					break;
				case 4:
					System.out.println("THU");
					break;
				case 5:
					System.out.println("FRI");
					break;
				case 6:
					System.out.println("SAT");
					break;
				case 7:
					System.out.println("SUN");
					break;
				default:
					System.out.print("输入错误！！！");
					break;
			}
			System.out.print("请输入一个数(1-7):");
			sr =input.nextInt();
		}
		System.out.print("程序已退出");
	}
}