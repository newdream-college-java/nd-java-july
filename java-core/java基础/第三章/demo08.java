/*8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ
4 λ����)*/
import java.util.Scanner;
public class demo08{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ");
		System.out.println("");
		System.out.println("");
		System.out.print("�������Ա��(<4λ����>):");
		int a = input.nextInt();
		System.out.print("�������Ա����(��/��<����λ����ʾ>):");
		String b = input.next();
		System.out.print("���������:");
		int c = input.nextInt();
		System.out.println("");
		System.out.println("");
		if(a<10000&&a>999){
			System.out.println("��¼���Ա��Ϣ��:");
			System.out.println(a+"    "+b+"    "+c);
		}else{
			System.out.println("��Ա�Ų��Ϸ�");
		}
	}
}