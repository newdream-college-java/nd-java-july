/*
2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/
import java.util.*;
public class Demo10{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		for(int i =1;i<=3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int a = input.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			String b = input.next();
			System.out.print("�������Ա���֣�");
			int c = input.nextInt();
			if(a>9999||a<1000){
				System.out.print("¼��ʧ��");
				break;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(a+"\t"+b+"\t"+c);
		}
		System.out.print("���������");
	}
}