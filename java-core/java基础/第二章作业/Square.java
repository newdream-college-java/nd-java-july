/*2������һ���������������εı߳�������������ε��ܳ����������*/
import java.util.Scanner;
public class Square{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����������α߳���");
		double l=input.nextDouble();
		double c,s;
		c=4*l;
		s=l*l;
		System.out.println("�߳�\t�ܳ�\t���");
		System.out.println(l+"\t"+c+"\t"+s);
	}
}