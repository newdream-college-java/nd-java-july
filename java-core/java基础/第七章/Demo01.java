/*
1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����
*/
import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//��ʾ��
		System.out.print("������1~10�е���������");
		int n = input.nextInt();
		if(n<1||n>10){
			System.out.print("���������������������룺");
			n = input.nextInt();
		}
		//��ӡ�ײ�
		System.out.print(n+"!=");
		int b= 1;
		//ѭ����ӡ
		for(;n>=1;n--){
			if(n>1){
				b*=n;
				System.out.print(n+"*");
			}
			if(n == 1){
				b*=n;
				System.out.print(n+"="+b);
			}
		}
	}
}