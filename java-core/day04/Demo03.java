import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		//2.4���������������������������������ȣ���ô���������������ȡ����������ж���������֮���Ƿ���� 1000��
		//������� 1000 �������������֮�ʹ��� 1000�������������������֮�Ͳ����� 1000����(Ƕ�� if)
		Scanner input=new Scanner(System.in);
		System.out.println("����������������");
		int onedata=input.nextInt();
		int twodata=input.nextInt();
		int threedata=input.nextInt();
		if(onedata==twodata && onedata==threedata){
			System.out.println("�����������");
		}else{ 
			if(onedata+twodata+threedata>1000){
				System.out.println("��������֮�ʹ���1000");
			}else{
					System.out.println("��������֮�Ͳ�����1000");
			}
		}
	}
}