/*����һ��С����Ȼ��������������ݺ�С������*/

import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��С��");
		double a =input.nextDouble();
		int b =(int)a;
		System.out.println("С��\t��������\tС������");
		System.out.println(a+"\t"+b+"\t\t"+(a-b));
	}
}