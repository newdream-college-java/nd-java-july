import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入小数：");
		double a = input.nextDouble();
		int b = (int)a;
		System.out.println("小数\t"+"整数部分\t"+"小数部分");
		System.out.println(a+"\t"+b+"\t"+(a-b));
	}
}