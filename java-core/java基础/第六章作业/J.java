/*
	ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/

import java.util.Scanner;

public class J{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int a=input.nextInt();
			System.out.print("�������Ա���գ���/�գ���");
			String b=input.next();
			System.out.print("�������Ա����(<4λ����>����");
			int c=input.nextInt();
			if(a/1000!=0&&a/10000==0){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(a+"\t"+b+"\t"+c);
			}else
				System.out.println("��Ա�Ÿ�ʽ����¼��ʧ�ܣ�����");
		}
	}
}