public class Demo01{
	public static void main(String[] arge){
		//1.1������ 100 ���ڵ�����֮��
		int sum=0;
		for(int i=0;i<100;i++){
			if(i%2!=0){
				sum+=i;
			}
		}
		System.out.println("100���ڵ���������"+sum);
		//1.2�� ����һ������Ϊ��FlipFlop������ϷӦ�ó������� 1 ������ 100������ 3
		//�ı�����������ʡ�Flip�������� 5 �ı�����������ʡ�Flop������Ϊ 3 �ı���ҲΪ
		//5 �ı����������FlipFlop����������������ǰ����
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
				continue;
			}
			if(i%3==0){
				System.out.println("Flip");
				continue;
			}
			if(i%5==0){
				System.out.println("Flop");
				continue;
			}
			System.out.println(i);
		}
		//1.3����� 1900-2012 ������
		for(int i=1900;i<=2012;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i+"��������");
			}
		}
		//1.4����� 10000-99999 ��������л�������˵�������磺12321 �ǻ���������λ��
			//��λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 99899
			for(int i=10000;i<100000;i++){
				if(i%10==i/10000%10&&i/10%10==i/1000%10){
					System.out.println(i);
				}
			}
		//1.5���� 100-999 ֮���ˮ�ɻ����������磺ˮ�ɻ��� 153=1*1*1+5*5*5+3*3*3��
		for(int i=100;i<1000;i++){
			int a=i%10;
			int b=i/10%10;
			int c=i/100%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
		//1.6������ 1*2*3*����*10 �Ľ��
		int svn=1;
		for(int i=1;i<=10;i++){
			svn*=i;
			System.out.print(i+"*");
		}
		System.out.println("="+svn);
	}
}