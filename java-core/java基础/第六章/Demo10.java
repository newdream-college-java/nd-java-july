/*
2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/
import java.util.Scanner;
public class Demo10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ");
		System.out.println("");
		for(int i = 1;i<=3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int a = input.nextInt();
			if(a<1000||a>9999){
				System.out.print("������Ļ�Ա�Ų��Ϸ������������룺");
				a = input.nextInt();
			}
			System.out.print("�������Ա���գ�����/��<����λ����ʾ>����");
			String birth = input.next();
			System.out.print("�������Ա���֣�");
			int b = input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println("��Ա��"+"\t"+"����"+"\t"+"��Ա����");
			System.out.println(a+"\t"+birth+"\t"+b);
			System.out.println("");
		}	
		System.out.println("�������������");
	}
}