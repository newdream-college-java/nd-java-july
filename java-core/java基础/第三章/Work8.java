/*8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ
4 λ����)*/
import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
			System.out.println();
			System.out.println("������4λ��Ա�ţ�");
			int a = input.nextInt();
			if(a>999&&a<10000){
				System.out.println("�������Ա���գ���/��<��λ����ʾ>����");
				String b = input.next();
				System.out.println("��������֣�");

				int c = input.nextInt();
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(a+"\t"+b+"\t"+c);
			}else System.out.println("��Ч��Ա��");
		}	
	}
}