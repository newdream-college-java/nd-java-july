import java.util.Scanner;
public class D{
	public static void main (String [] args ){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a  = input.nextInt();
		switch(a){
		case 1:
		System.out.println("这是星期一！");
		break;
		case 2:
		System.out.println("这是星期二！");
		break;
		case 3:
		System.out.println("这是星期三！");
		break;
		case 4:
		System.out.println("这是星期四！");
		break;
		case 5:
		System.out.println("这是星期五！");
		break;
		case 6:
		System.out.println("这是星期六！");
		case 7:
		System.out.println("这是星期天！");
		break;
		default :
		System.out.println("输入错误！");
		}
}
}