import java.util.Scanner;
public class DemoWork02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//1.������С��������a,b�У����ʵ��a��b�����е�ֵ������������a��b�е�ֵ
		System.out.println("����������(С��)");
		double a=input.nextDouble(),b=input.nextDouble(),c;
		System.out.println("��һ�⣺a="+a+",b="+b+",a��b������");
		c=a;
		a=b;
		b=c;	
		System.out.println("a="+a+"\tb="+b);
		System.out.println("********************�ָ���**********************");
		//2.����һ���������������εı߳���������ܼ������
		System.out.println("�ڶ��⣺�����������εı߳�:��");
		double length=input.nextDouble(),perimeter,area;
		perimeter=4*length;
		area=length*length;
		System.out.println("�����εı߳�"+length+"\n�������ܳ�"+perimeter+"\n���������Ϊ��"+area);
		//3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������
		System.out.println("********************���ǻƽ�ָ���**********************");
		System.out.println("�����⣺����һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������");
		int theInteger=input.nextInt();
		int bits=theInteger%10;
		int ten=theInteger/10%10;
		int best=theInteger/100%10;
		int thousand=theInteger/1000%10;
		System.out.println("��λ\tʮλ\t��λ\tǧλ");
		System.out.println(bits+"\t"+ten+"\t"+best+"\t"+thousand);
		System.out.println("********************���ǻƽ�ָ���**********************");
		
		//4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ���������
		System.out.println("�����⣺4�������������������뵽�������� a �� b �У���̽� a �� b �е�ֵ���������");
		int oneInteger=input.nextInt(),twoInteger=input.nextInt(),threeInteger;
		threeInteger=oneInteger;
		oneInteger=twoInteger;
		twoInteger=threeInteger;
		System.out.println("a="+oneInteger+"\tb="+twoInteger);
		System.out.println("********************���ǻƽ�ָ���**********************");
		
		//5.����һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ���������룺25����ô�����1 ���� 1 ��Сʱ
		System.out.println("��Ŀ�壺����һ�������������� n ��Сʱ������ n ��Сʱ���ڶ���������ٸ�Сʱ");
		int oneInt=input.nextInt(),day,time;
		time=oneInt%24;
		day=oneInt/24;
		System.out.println(day+"��"+time+"ʱ");
		System.out.println("********************���ǻƽ�ָ���**********************");
		
		//6������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ������������������� 123 ���������뵽 a,b,c ��ȥ�������� a,b,c ��ֵ��Ҫ����� 321��
		System.out.println("��Ŀ��������һ�� 3 λ�����ֱ���뵽 3 ��������ȥ����̽��� 3 �������е�ֵ�����������");
		int sumInteger=input.nextInt();
		int aInteger=sumInteger/100%10;
		int bInteger=sumInteger/10%10;
		int cInteger=sumInteger%10;
		int dInteger;
		dInteger=aInteger;
		aInteger=cInteger;
		cInteger=dInteger;
		System.out.println("a="+aInteger+"\tb="+bInteger+"\tc="+cInteger);
		System.out.println("********************���ǻƽ�ָ���**********************");
		
	}

}