/*
	ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,
	Ҫ��ʹ��continue ������
 */
import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			int count=0;
			for(int i=1;i<=5;i++){
				System.out.print("�����"+i+"��ѧ���ĳɼ���");
				int a=input.nextInt();
				if(a<80){
					continue;
				}
				count++;
			}
			System.out.println("�ܹ���"+count+"ѧ���ĳɼ�����80��");
	}
}