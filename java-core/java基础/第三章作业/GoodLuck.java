/*������ GoodLuck ʵ�����˳齱���齱����
��Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ ���˻�Ա  */

import java.util.Scanner;

public class GoodLuck{
	public static void main (String [] args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������ع������ϵͳ>���˳齱\n\n");
	System.out.print("��������λ��Ա�ţ�");
	int i=input.nextInt();
	int a=i/10%10;
	if(a==6){
	System.out.print(i+"�ſͻ������˿ͻ�������Mp3һ����");
	}else{
	System.out.print(i+"�ſͻ���лл����֧�֣�");
	}
	}
}