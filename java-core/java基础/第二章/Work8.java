import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������С����");
		double a = input.nextDouble();
		int b = (int)a;
		System.out.println("С��\t"+"��������\t"+"С������");
		System.out.println(a+"\t"+b+"\t"+(a-b));
	}
}