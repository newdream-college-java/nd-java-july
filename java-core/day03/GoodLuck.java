import java.util.Scanner;
import java.util.Random;
//import java.lang.Integer;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//������ GoodLuck ʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ���˻�Ա
		System.out.print("�����󼦰Թ������ϵͳ > ���˳齱\n");
		System.out.print("������4λ��Ա�ţ�");
		int data=input.nextInt();
		String code="";
		Random random=new Random();//���������
		for(int i=1;i<=6;i++){
			code+=random.nextInt(10);
		}
		System.out.println("�������������"+code);
		code=code.substring(2,6);
		System.out.println("���������������λ��"+code);
		int a=Integer.parseInt(code);//ת��Ϊ��������
		if(a==data){
			System.out.println(data+"�ſͻ������˿ͻ�����ý���");
		}else{
			System.out.println(data+"�ſͻ�,лл����֧�֣�");
		}
	}
}