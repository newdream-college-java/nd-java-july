import java.util.Scanner;
public class A7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������");
		int a=input.nextInt();
		int sum=a;
		while(a!=0){
			System.out.print("������һ������");
			a=input.nextInt();
			sum+=a;
		}
		System.out.println(sum);
	}
}