/*8��(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ����*/
import  java.util.Scanner;
public class NumApart{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������С����");
		double num=input.nextDouble();
		int a=(int)num/1;
		double b=num-a;
		System.out.println("С��\t��������\tС������");
		System.out.println(num+"\t"+a+"\t\t"+b);
	}
}