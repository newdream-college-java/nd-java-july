/*2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��*/
import java.util.*;
public class J{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��(4λ����)��");
			int a=input.nextInt();
			if(a<1000||a>9999){
				System.out.print("¼��ʧ�ܣ�������¼�룺");
				a=input.nextInt();
			}else{
				System.out.print("�������Ա���գ���/��<��λ������ʾ>����");
				String s=input.next();
				System.out.print("�������Ա���֣�");
				int b=input.nextInt();
				System.out.println("��¼�����Ϣ�ǣ�");
				System.out.println(a+"\t"+s+"\t"+b);
			}
		}
		System.out.print("���������");
	}
}