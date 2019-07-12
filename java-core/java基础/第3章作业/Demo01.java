/*输入一个三位整数，判其是不是降序数*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int a=input.nextInt();
		if(a/100>a/10%10&&a/10%10>a%10){
			System.out.println(a+"是降序数");
		}else{
			System.out.println(a+"不是降序数");
		}
	}
}