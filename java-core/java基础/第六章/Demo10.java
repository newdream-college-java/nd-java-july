/*2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��*/
import java.util.*;
public class Demo10{
	public static void main(String [] args ){
		Scanner input=new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.println("MyShopping����ϵͳ > �ͻ���Ϣ���� > ��ӿͻ���Ϣ");
		System.out.println("");
		System.out.println("");
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա��(<��λ����>) :");
			int number=input.nextInt();
			if(number<1000||number>9999){
				System.out.println("¼��ʧ�ܣ�����������");
				i--;
				continue;
			}
			System.out.print("�������Ա����(��/��<����λ������ʾ>) :");
			String birthday=input.next();
			System.out.print("�������Ա����:");
			int jf=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println(number+"  "+birthday+"  "+jf);
			System.out.println("");
			System.out.println("");
		}
		System.out.println("���������");
	}
}