/*������ AddCust ¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ
4 λ����)*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.print("�������Ա�ţ�4λ��������");
		int a=input.nextInt();
		if(a<1000||a>=10000||(a-a/1!=0)){
			System.out.println("����Ļ�Ա�Ÿ�ʽ����ȷ��4λ��������");
		}
		System.out.print("�������Ա���գ�����λ����ʾ����");
		String b=input.next();
		int len=b.length();
		if(len!=5){
			System.out.println("����ĸ�ʽ���󣬸�ʽΪxx/xx��");
		}
		System.out.print("��������֣�");
		int c=input.nextInt();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(a+"\t"+b+"\t"+c);
		
	}
}