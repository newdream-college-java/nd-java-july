/*ѭ��¼��3λ��Ա��Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��*/
import java.util.*;
public class Demo10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա�ţ�4λ��������");
			int num=input.nextInt();
			if((num/1000)!=0&&num<10000){
				System.out.print("�������Ա����(��/��<����λ������ʾ>)��");
				String birth=input.next();
				System.out.print("�������Ա���֣�");
				int jf=input.nextInt();
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(num+"\t"+birth+"\t"+jf);
			}else{
				System.out.println("¼��ʧ�ܣ�����");
				break;
			}
			
		}
		
	}
}