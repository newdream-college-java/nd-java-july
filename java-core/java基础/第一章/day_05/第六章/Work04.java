/*1.4����� 10000-99999 ��������л�������˵�������磺12321 �ǻ���������λ�� ��λ��ͬ��ʮλ��ǧλ��ͬ��12321 99999 9989*/
public class Work04{
	public static void main(String [] args){
		System.out.println("10000-99999 ��������л�����:");
		for(int i=10000;i<=99999;i++){
			if(i%10==i/10000&&(i/10%10==i/1000%10)){
				System.out.print(i+"\t");
			}
		}
	}
}