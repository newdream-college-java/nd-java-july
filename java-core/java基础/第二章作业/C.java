/*����һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������*/

public class C{
	public static void main(String[] args) {
		int i=1234;
		int a,b,c,d;
		a=i%10;
		b=i/10%10;
		c=i/100%10;
		d=i/1000;
		System.out.println("��λ��������Ϊ��"+i);
		System.out.println("��λ\tʮλ\t��λ\tǧλ");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
	}
}