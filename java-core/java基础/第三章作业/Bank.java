/*3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ�����
�������롣ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ�
�ܵ��� 6 λ)*/
import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String s1="qwer1234";
		String s2="asdf1234";
		System.out.print("�������һ�����룺");
		String m1=input.next();
		if(s1.equals(m1)){
			System.out.print("������ڶ������룺");
			String m2=input.next();
			if(s2.equals(m2)){
				System.out.println("��ϲ�õ�Ǯ��");
			}else{
				System.out.println("�ڶ����������");
			}
		}else{
			System.out.println("��һ���������");
		}
	}
}