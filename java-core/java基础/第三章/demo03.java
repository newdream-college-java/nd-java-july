/*3��������һ�����б��չ����������롣���õ������Ǯ����������������붼Ҫ��ȷ��
�����һ�����붼����ȷ����ֱ�Ӱ����������棻�����һ������������ȷ��������Ȩ�����
�������롣ֻ�е��ڶ�������Ҳ������ȷ�������õ�Ǯ��(���������Լ��裬Ҫ�����볤�Ȳ�
�ܵ��� 6 λ)*/
import java.util.Scanner;
public class demo03{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		String m1="yuankun123";
		String m2="yuankun321";
		System.out.println("�������һ�����룺");
		String a = input.next();
		if(a.equals(m1)){
			System.out.println("������ڶ������룺");
			String b = input.next();
			if(b.equals(m2)){
				System.out.println("��ϲ�õ�Ǯ��");
			}else{
				System.out.println("�ڶ����������");
			}
		}else{
			System.out.println("��һ���������");
		}
		
	}
}