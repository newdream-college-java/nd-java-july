/*8��������AddCust¼���Ա��Ϣ,������Ա�š����պͻ����ж�¼��Ļ�Ա���Ƿ�Ϸ�(����Ϊ4λ����)*/
import java.util.*;
public class AddCust{
	public static void main(String[] args){
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println();
		Scanner input =new Scanner(System.in);
		System.out.print("�������Ա�ţ�<4λ����>����");
		int a=input.nextInt();
		System.out.print("�������Ա���գ���/��<����λ����ʾ>����");
		int m=input.nextInt();
		int d=input.nextInt();
		System.out.print("��������֣�");
		int s=input.nextInt();
		System.out.println();
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
		System.out.println(a+"\t"+m+"/"+d+"\t"+s);
		
	}
}