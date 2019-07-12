/*输入一个年份，判是闰年还是平年*/
import java.util.Scanner;
public class A2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个年份");				
		int a = input.nextInt();
		if(a%4 == 0){
			System.out.print("这个年份是闰年");
		}else{
			System.out.print("这个年份是平年");
		}
	}
}