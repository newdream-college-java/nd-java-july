/*  ��������С�������� a,b �У����ʵ�� a �� b �����е�ֵ������ 
    ������ a �� b �е�ֵ��  */


public class A{
	public static void main(String[] args) {
		double a=1.1,b=2.2,c;
		c=a;
		a=b;
		b=c;
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);
	}
}