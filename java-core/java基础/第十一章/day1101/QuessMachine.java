package Work;

import java.util.Random;
import java.util.Scanner;

/**
 * 1���������һ����Ʒ�����û��²����ļ�ֵ������ڹ涨������
	�¶ԣ��� �ɻ�ô���Ʒ��ģ�⾺�»
 */
public class QuessMachine {
	int price;
	public void initial() {
		Random random = new Random();
		int a = random.nextInt(3)+1;
		switch (a) {
		case 1:
			System.out.println("��²���������ģ�͵ļ۸�");
			price = 503;
			break;
		case 2:
			System.out.println("��²���ƿ�������������ţ�̵ļ�Ǯ��");
			price = 250;
			break;
		case 3:
			System.out.println("��²���ƿ82��ѩ�̵ļ�Ǯ��");
			price = 3000;
			break;

		default:
			break;
		}
	}
	public void guess() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5;i++ ) {
			int b = scanner.nextInt();
			if (b==price) {
				System.out.println("��ϲ�㣬�¶��ˣ���");
				
			}else if (b>price) {
				System.out.println("��С�㣡");
			}else {
				System.out.println("�ٴ�㣡");
			}
			
			if (i==4) {
				System.out.println("��ζ�û�¶ԣ��ѿ�������");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuessMachine quessMachine = new QuessMachine();
		quessMachine.initial();
		quessMachine.guess();
	}

}
