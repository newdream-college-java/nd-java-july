/*����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ��
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������*/
import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Work8 ms = new Work8();
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("*******************************************************************");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.println("\t\t3.�������");
		System.out.println("\t\t4.ע��");
		System.out.println("*******************************************************************");
		System.out.println();
		System.out.print("��ѡ���������֣�");
		int a = sc.nextInt();
		while(a>4 || a<1){
			System.out.println("�������������ѡ��");
			System.out.print("��ѡ���������֣�");
			a = sc.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("��ӭ�����ͻ���Ϣ�������");
				break;
			case 2:
				ms.MyShopping();
				break;
			case 3:
				System.out.println("��ӭ���������������");
				break;
			case 4:
				System.out.println("��ӭ�����ͻ���Ϣ�������");
				break;
			default:
				break;
			}
	}


	public void MyShopping(){
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println();
		System.out.println("1.T��\t\t2.����Ь\t3.������");
		System.out.println("*******************************************************************");
		System.out.println();
		while(true){
			System.out.print("��������Ʒ��ţ�");
			int a = sc.nextInt();
			System.out.print("�����빺��������");
			int b = sc.nextInt();
			switch(a){
				case 1:
					sum = sum+245.0*b;
					System.out.println("T����245.0\t\t����"+b+"\t\t�ϼƣ�"+sum);
					break;
				case 2:
					sum = sum+300.0*b;
					System.out.println("T����300.0\t\t����"+b+"\t\t�ϼƣ�"+sum);
					break;
				case 3:
					sum = sum+400.0*b;
					System.out.println("T����400.0\t\t����"+b+"\t\t�ϼƣ�"+sum);
					break;
				default:
					break;
			}
			System.out.print("�Ƿ������y/n��");
			System.out.println();
			char c = sc.next().charAt(0);
			if(c=='n'){
				break;
			}

		}
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����"+(sum*0.8));
		System.out.println("ʵ����2000");
		System.out.println("��Ǯ��"+(2000-sum*0.8));	
	}
}