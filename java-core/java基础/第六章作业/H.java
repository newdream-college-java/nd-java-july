/*	ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,
	Ҫ��ʹ�� continue������
*/

import java.util.Scanner;
public class H{
	public static void main(String[] args){
		int b=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"�ɼ���");
			int a=input.nextInt();
			if(a<80){
				continue;
			}
			b++;
		}
		System.out.println("��"+b+"�˵ĳɼ����� 80 ��");
	}
}
	
