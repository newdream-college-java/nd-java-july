import java.util.Scanner;
public class F{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = input.nextInt();
		int b = 0;
		int c = 0;
		for(int i = 1;i<=a;i++){
		if(i%2==0){
		b++;
		}else {
		c++;
		}
		}
		System.out.println("奇数有："+c+"个");
		System.out.println("偶数有："+b+"个");
}
}