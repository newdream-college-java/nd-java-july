package work;

/**
 * 1.6��дһ����ѧ�ҵ��࣬�����д������ķ�������: 
 * a)�����������������бȽϣ������������е����ֵ�ķ�����
 * b)����һ��������������������ĸ�λ���Ǽ��ķ����� 
 * c)����һ��������������������������ķ����� 
 * d)����һ��������������� 1
 * �ӵ��������ĺ��Ƕ��ٵķ�������������һ�� 5 ��ô�ͼ��� 1+2+3+4+5=15����󷵻� 15��
 * 
 * */
public class MathMan {
	public int max(int a,int b) {
		return a>b?a:b;
	}
	public int number1(int a) {
		return a%10;
	}
	public int number2(int a) {
		return a*a*a;
	}
	public int number3(int a) {
		int sum = 0;
		for(int i =1;i<=a;i++){
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		MathMan math = new MathMan();
		System.out.println(math.max(1, 9));
		System.out.println(math.number1(123));
		System.out.println(math.number2(4));
		System.out.println(math.number3(5));
	}
}
