/*2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ�� �ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ��������������������� �˼����ҡ�*/
import java.util.Scanner;
public class Work02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("��������ӵ�����������");
		int n=in.nextInt();
		if(n>5){
			System.out.println("����"+(n+2)+"������");
			
		}else if(n<=5&&n>=3){
			System.out.println("����"+(n+1)+"������");
		}else if(n<3){
			System.out.println("����"+n+"������");
		}else {
			System.out.println("���벻�Ϸ�!");
		}
	}

}