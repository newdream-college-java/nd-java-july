import java.util.*;
public class J{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int i = 1;
		String num;
		String b;
		int c;
		System.out.println("�������1λ��Ա�ţ�<4λ����>����");
		while(i<=3){
		
		if(input.hasNextInt()){
		
		num = input.next();
	
		}else {
		num = input.next();
		System.out.println("¼��ʧ�ܣ����������룺");
		num = input.next();
		}
		System.out.println("�������Ա����(��/��<����λ������ʾ>)��");
		b = input.next();
		
		
		System.out.println("�������Ա���֣�");
		c = input.nextInt();
		
		System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�"+num+"\t"+b+"\t"+c);
		i++;
		System.out.println("�������"+i+"λ��Ա�ţ�<4λ����>����");
		}
		System.out.println("���������");
	}
}