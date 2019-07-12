/*输入一个三位整数，判其是不是降序数*/
import java.util.Scanner;
public class A1{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个三位整数: ");
		int a = input.nextInt();
		if(a/100 > a/10%10){
			if(a/100 > a%10){
				System.out.print("这个数是降序数");
			}else {
				System.out.print("这个数不是降序数");
			}
		}else {
			System.out.print("这个数不是降序数");
		}
	}
}