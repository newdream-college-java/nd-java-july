import java.util.Scanner;


public class CurretTimeDemo {
	public static void main(String[] args) {
		CurrentTime data=new CurrentTime();
		data.show();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入更改的年份");
		data.year=input.nextInt();
		System.out.println("请输入更改的月份");
		data.month=input.nextInt();
		System.out.println("请输入更改的日");
		data.day=input.nextInt();
		System.out.println("请输入更改的时");
		data.point=input.nextInt();
		System.out.println("请输入更改的分");
		data.points=input.nextInt();
		System.out.println("请输入更改的秒");
		data.seconds=input.nextInt();
		data.show();
	}
}
