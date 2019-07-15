import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*
		1.7、 从键盘上输入一个数，当输入 1~7 时，显示下面对应的信息；输入 1~7 之外
		的值时，提示错误重新输入，直到输入 0 退出循环。
		1：MON 2：TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
		*/
		Scanner input=new Scanner(System.in);
		int data;
		String value="";
		do{
			System.out.println("输入 1~7 之外的值,输入 0 退出循环。");
			data=input.nextInt();
			switch(data){
				case 0:
				System.exit(-1);
				case 1:
					value="MON";
					break;
				case 2:
					value="TUE";
					break;
				case 3:
					value="WED";
					break;
				case 4:
					value="THU";
					break;
				case 5:
					value="FRI";
					break;
				case 6:
					value="SAT";
					break;
				case 7:
					value="SUN";
					break;
				default:
					System.out.println("输入有误请重新输入");
			}
		}while(data<0||data>7);
		System.out.print(value);
	}
}