/*
1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
*/
import java.util.Scanner;
import java.util.Random;
public class Demo06{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("************��ȭС��Ϸ��������ʤ�ƣ�************");
		int m = 0;
		int n = 0;
		int j = 0;
		while(j<=2){
			System.out.print("���ȭ��0��ʯͷ/1������/2��������");
			int a = sc.nextInt();
			//��������ʱ
			while(a != 0&&a != 1&&a !=2){
				System.out.print("���������������������룺");
				a = sc.nextInt();
			}
			//�˳�ȭ�ж�
			switch(a){
				case 0:		
					System.out.println("�������ǣ�ʯͷ��");
					break;
				case 1:
					System.out.println("�������ǣ�������");
					break;
				default :
					System.out.println("�������ǣ�����");
					break;
				}
			
			//���Գ�ȭ�ж�
			Random rd = new Random();
			int computer = rd.nextInt(3);
			if(computer == 0){
				System.out.println("���Գ����ǣ�ʯͷ��");
			}
			if(computer == 1){
				System.out.println("���Գ����ǣ�������");
			}
			if(computer == 2){
				System.out.println("���Գ����ǣ���");
			}

			//�Ʒ�
			int g = a-computer;
			switch(g){
				case (-1):
				case 2:
					m++;
					System.out.println("��ǰ������Եıȷ�Ϊ��"+m+"��"+n);
					break;
				case 0:
					System.out.println("��ǰ������Եıȷ�Ϊ��"+m+"��"+n);
					break;
				default :
					n++;
					System.out.println("��ǰ������Եıȷ�Ϊ��"+m+"��"+n);
					break;
				
			}
			j++;
		}
		//�ж���Ӯ
		if(m >n){
			System.out.println("��ϲ��Ӯ���˱���������");
		}
		else if(m == n){
			System.out.println("��������Դ����ƽ�֣�����");
		}
		else{
			System.out.println("���ź����������ⳡ����������");
		}
	}
}