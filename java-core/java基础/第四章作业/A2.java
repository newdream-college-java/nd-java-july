/*2.2�����̲μӼ������̴���*/
import java.util.Scanner;
public class A2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������õ�����:");
		int a = input.nextInt();
		switch(a){
			case 1:
			System.out.print("��ϲ��òμ���ʡ����ѧ��֯��1��������Ӫ�Ļ���");
			break;
			case 2:
			System.out.print("��û��ձʼǱ�����һ̨");
			break;
			case 3:
			System.out.print("�����ƶ�Ӳ��һ��");
			break;
			default:
			System.out.print("���´���Ŭ��");
		}
	}
}