/*�������� AddCust ¼���Ա��Ϣ,������Ա�š�
���պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ 4 λ����)  */

import java.util.Scanner;

public class AddCust{
	public static void main(String []  args){
	Scanner input=new Scanner(System.in);
	System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n\n");
	System.out.print("�������Ա�ţ�");
	int x=input.nextInt();
	System.out.print("�������Ա���գ�");
	String y=input.next();
	System.out.print("��������֣�");
	int z=input.nextInt();
	if(!(x/1000==0)&&x/10000==0){
	System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
	System.out.println(x+"\t"+y+"\t"+z);
	}else{
	System.out.println("��Ա�ŵĸ�ʽ���󣡣�");
	}
	} 
}