import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//8�������� AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ4 λ����)
		System.out.println("��������Թ������ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ\t");
		System.out.print("�������Ա��(<4λ����>)��");
		int userName=input.nextInt();
		if(userName<=1000||userName>=10000){
			System.out.print("�������Ա��(<4λ����>)");
			return;
		}
		System.out.print("�������Ա����(��/��<����λ����ʾ>)��");
		String birthday=input.next();
		if(birthday.indexOf("/")==-1){
			System.out.print("������(��/��<����λ����ʾ>)");
			return;
		}
		System.out.print("��������֣�");
		int intergral=input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println("��Ա��\t��Ա����\t����");
		System.out.println(userName+"\t"+birthday+"\t\t"+intergral);
	}
}

