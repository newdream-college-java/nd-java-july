/*7�������� GoodLuck ʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա*/
import java.util.*;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.print("��������λ��Ա�ţ�");
		int a=input.nextInt();
		int b=a/100%10;
		Random r=new Random();
		int c=Math.abs(r.nextInt())%10;
		//System.out.println(c);	
		if(b==c){
			System.out.println(a+"�ſͻ������˿ͻ�����þ���Mp3һ����");
		}else{
			System.out.println(a+"�ſͻ���лл����֧�֣�");	
		}
		
	}
}