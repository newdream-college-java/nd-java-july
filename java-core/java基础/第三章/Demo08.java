/*
8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ 4 λ����
*/
import java.util.*;
public class Demo08{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println();
		System.out.print("�������Ա�ţ�<4λ����>����");
		int number = input.nextInt();
		if(number<1000||number>9999)
		System.out.println("����Ļ�Ա�Ų��Ϸ�");
		else{
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		String birthday = input.next();
		System.out.print("��������֣�");
		String jf = input.next();
		System.out.println();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.print(number+"\t"+birthday+"\t"+jf);
		}

	}
}