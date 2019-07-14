/*输入三个整数，如果这三个整数都相等*/
import java.util.Scanner;
public class A4 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数");
		int a = input.nextInt();
		System.out.print("请输入第二个整数");
		int b = input.nextInt();
		System.out.print("请输入第三个整数");
		int c = input.nextInt();
		if(a == b){
			if(a == c){
				System.out.print("这三个数相等");	
			}else if(a+b+c > 1000){
				System.out.print("这三个数之和大于1000");
			}else {
				System.out.print("这三个数之和不大于于1000");
			}
		}else if(a+b+c > 1000){
			System.out.print("这三个数之和大于1000");
		}else {
			System.out.print("这三个数之和不大于1000");
		} 
	}
}