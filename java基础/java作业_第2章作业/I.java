/*8��(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ���� 
С�� ��������  С������ 
3.14 3  0.14 */
import java.util.Scanner;
public class I{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��С����");
		double a = input.nextDouble();
		int b = (int)a/1;
		double c = a-b;
		System.out.println("С��\t��������\tС������");
		System.out.println(a+"\t"+b+"\t\t"+c);
}
}