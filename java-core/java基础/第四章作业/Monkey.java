/*2.1������ȥ���ң������ 3 �����£��ϰ�Ͳ����ң������ 3 ���� 5 ��������һ�� �ң������ 5 �����Ͼ��� 2 ���ң�����Ҫ��������ӵ��������������������� �˼����ҡ�*/
import java.util.Scanner;
public class Monkey{
	public static void main(String[] args){
		int total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("�����������������");
		int num=input.nextInt();
		if(num>0&&num<3){
			total=num;
		}else if(num>=3&&num<=5){
			total=num+1;
		}else if(num>5){
			total=num+2;
		}
		System.out.print("�������յõ�������"+total);
	}
}