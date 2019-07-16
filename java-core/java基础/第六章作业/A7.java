import java.util.Scanner;
public class A7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数字");
		int a=input.nextInt();
		int sum=a;
		while(a!=0){
			System.out.print("请输入一个数字");
			a=input.nextInt();
			sum+=a;
		}
		System.out.println(sum);
	}
}