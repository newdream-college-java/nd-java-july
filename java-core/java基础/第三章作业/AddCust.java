/*8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ4 λ����)*/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.print("�������Ա�ţ���λ��������");
		int a=input.nextInt();
		if(a>999&&a<10000){
			System.out.print("�������Ա���գ���/�գ���");
			String b=input.next();
			System.out.print("��������֣�");
			int c=input.nextInt();
			System.out.println();
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(a+"\t"+b+"\t"+c);
		}else{
			System.out.println("��Ա���������!");	
		}
	}
}