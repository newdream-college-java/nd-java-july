import java.util.Scanner;
public class Day02Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//4�����"�㰮����",����ش����"yes",�����"���ǰ��ҵ�",����ش����"no",�����"ԭ���㲻����",����ش���������������"�㵽���ǰ����ǲ������Լ�Ҳ�����
		System.out.println("�㰮���룿");
		String i=input.next();
		if(i.equals("yes")){
			System.out.println("���ǰ��ҵ�");
		}else if(i.equals("no")){
			System.out.println("ԭ���㲻����");
		}else{
			System.out.println("�㵽���ǰ����ǲ������Լ�Ҳ�����");
		}
		//�������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��������������е�ֵ��С��������
		System.out.println("*******************���ǻƽ�ָ���**********************");
		System.out.println("������a��ֵ");
		int a=input.nextInt();
		System.out.println("������b��ֵ");
		int b=input.nextInt();
		System.out.println("������c��ֵ");
		int c=input.nextInt();
		int d;
		if(a<b){
			d=a;
			a=b;
			b=d;
		}else if(a<c){
			d=a;
			a=c;
			c=d;
		}else if(b<c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println("���������е�ֵ��С��������:"+a+">"+b+">"+c);
	}
}