package ��11����ҵ;
/*1���������һ����Ʒ�����û��²����ļ�ֵ������ڹ涨������
�¶ԣ��� �ɻ�ô���Ʒ��ģ�⾺�»��*/
import java.util.Random;
import java.util.Scanner;

public class QuessMachine {
	String name;
	int price;
	public int initial(){
		Random random=new Random();
		int r=random.nextInt(4);
		switch (r) {
		case 0:	
			name="��ΪP30�ֻ�";
			price=5500;
			System.out.println("��²�"+name+"�ļ۸�");
			return price;			
		case 1:		
			name="�����綯��";
			price=4400;
			System.out.println("��²�"+name+"�ļ۸�");
			return price;
		case 2:			
			name="ƻ���ʼǱ�����";
			price=11500;
			System.out.println("��²�"+name+"�ļ۸�");
			return price;
		case 3:	
			name="PSP��Ϸ��";
			price=1500;		
			System.out.println("��²�"+name+"�ļ۸�");
			return price;
		}
		return price;
	}
	public void guess() {
		int s=initial();
		int count=0;
		Scanner inputScanner=new Scanner(System.in);
		int a=inputScanner.nextInt();
		for (int i = 0; i < 4; i++) {	
			if (s>a) {
				System.out.println("�ٴ�㣡");
				count++;
			}else if (s<a) {
				System.out.println("��С�㣡");
				count++;
			}else {
				System.out.println("��ϲ��¶��ˣ�");
				break;
			}
			System.out.print("�ٲ�һ�ΰɣ�");
			a=inputScanner.nextInt();
			if (count==4) {
				System.out.println(count+"����û�в��У��´�Ŭ���ɣ�");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuessMachine qm=new QuessMachine();
		qm.guess();
	}

}
