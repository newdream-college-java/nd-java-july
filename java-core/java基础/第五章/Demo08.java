/*
ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��

����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ��
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������

����ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ��
�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ��
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("***********��ӭʹ�ù������ϵͳ************");
		System.out.println("                       1���ͻ���Ϣ����");
		System.out.println("                       2���������");
		System.out.println("                       3���������");
		System.out.println("                       4��ע��");
		System.out.println("*******************************************");
		System.out.println("");
		System.out.print("��ѡ���������֣�");
		int a = sc.nextInt();
		while(a != 1 && a != 2 && a != 3 && a != 4){
			System.out.print("���������������������֣�");
			a = sc.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("�������ϵͳ > �ͻ���Ϣ����");
				System.out.println("ϵͳ���������У������ڴ���");
				break;
			case 2:
				System.out.println("�������ϵͳ > �������");
				System.out.println("*******************************");
				System.out.println("��ѡ�������Ʒ��ţ�");
				System.out.println("1��T��"+"\t"+"2������Ь"+"\t"+"3��������");
				System.out.println("*******************************");
				System.out.print("��������Ʒ��ţ�");
				int b = sc.nextInt();
				System.out.print("�����빺��������");
				int c = sc.nextInt();
				System.out.println("T����245.0"+"\t"+"����"+c+"\t"+"�ϼƣ�"+245.0*c);
				System.out.print("�Ƿ������y/n��");
				String d = sc.next();
				while(d.equals("y")){
					//��������
				}
				System.out.println("�ۿۣ�8��");
				System.out.println("Ӧ����"+245.0*c*0.8);
				System.out.print("ʵ����");
				double e = sc.nextDouble();
				double money = e-245.0*c*0.8;
				System.out.println("��Ǯ��"+money);
				break;
			case 3:
				System.out.println("�������ϵͳ > �ͻ���Ϣ����");
				System.out.println("ϵͳ���������У������ڴ���");
				break;
			default :
				break;
				
				
		}
		

	}
}