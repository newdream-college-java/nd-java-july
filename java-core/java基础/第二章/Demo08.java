/*
8��(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ���� 
С�� 	��������  	С������ 
3.14	 3 	 0.14 
*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��С����");
		double number = input.nextDouble();
		int x = (int)number/1;
		double y =number-x;
		System.out.println("С��\t��������\tС������");
		System.out.println(number+"\t"+x+"\t\t"+y);
	}
}