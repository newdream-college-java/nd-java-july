/*	ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ�� 
	����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)�����ۼӵ��ܽ�� 
	������nʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ�������� 
	����ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ�� 
	�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ�� 
*/

import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out.println("**********************************************");
		System.out.println("\t1.�ͻ���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("\t3.�������");
		System.out.println("\t4.ע��");
		System.out.println("***********************************************\n\n");
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
				double sum = 0;
				System.out.println("��ѡ�������Ʒ��ţ�");
				System.out.println();
				System.out.println("1.T��\t\t2.����Ь\t3.������");
				System.out.println("************************************************\n\n");
				while(true){
					System.out.print("��������Ʒ��ţ�");
					a = sc.nextInt();
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
}
	
