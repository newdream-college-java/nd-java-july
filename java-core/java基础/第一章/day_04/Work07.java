/*1.7、 从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外的值时，提示错误重新输入，直到输入 0 退出循环。
1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/
import java.util.*;
public class Work07{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入数字（1-7）：");
			int a =sc.nextInt();
			switch(a){
				case 1:
					System.out.println("1:MON");
					break;
				case 2:
					System.out.println("2:TUE");
					break;
				case 3:
					System.out.println("3:WED");
					break;
				case 4:
					System.out.println("4:THU");
					break;
				case 5:
					System.out.println("5:FRI");
					break;
				case 6:
					System.out.println("6:SAT");
					break;
				case 7:
					System.out.println("7:SUN");
					break;
				case 0:
					System.out.println("系统退出！！");
					System.exit(-1);
					break;
				default:
					System.out.println("输入错误，请重新输入！！");
					break;

			}
		}
	}
}