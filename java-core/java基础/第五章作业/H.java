/*����ϵͳ*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭʹ��MyShopping�������ϵͳ\n");
		System.out.println("****************************************");
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("3.�������");
		System.out.println("4.ע��");
		System.out.println("****************************************\n");
		System.out.print("��ѡ���������֣�");
		int a=input.nextInt();
		while(a<=0||a>4){
			System.out.print("����������������룺");
			a=input.nextInt();
		}
		switch(a){
			case 1:
				System.out.println("������δ��ͨ!");
				break;
			case 2:
				System.out.println("**********************************");
				System.out.println("\t��ӭʹ���������ع���ϵͳ");
				System.out.println("MyShopping����ϵͳ>�������");
				System.out.println("�����빺�����Ʒ��ţ�");
				System.out.println("1.T��\t2.����Ь\t3.������");
				System.out.println("**********************************");
				double m1=0,m2=0,m3=0;
				String s="n";
				do{
					System.out.print("��������Ʒ��ţ�(1-3)");
					int c=input.nextInt();
					System.out.print("�����빺��������");
					int d=input.nextInt();
					switch(c){
						case 1:
							m1=245.0*d;
							System.out.println("1.T��\t��245.0\t����"+d+"\t"+"�ϼƣ�"+m1);
							break;
						case 2:
							m2=234.0*d;
							System.out.println("2.����Ь\t��234.0\t����"+d+"\t"+"�ϼƣ�"+m2);
							break;
						case 3:
							m3=165.0*d;
							System.out.println("3.������\t��165.0\t����"+d+"\t"+"�ϼƣ�"+m3);
							break;
						default:
							System.out.println("�������!");
							System.exit(-1);								
					}
					System.out.println("�Ƿ��������y/n��");
					s=input.next();
				}while(s.equals("y"));
				System.out.println("�ۿ�:0.8!");
				System.out.println("Ӧ����"+0.8*(m1+m2+m3));
				System.out.print("ʵ����");
				double fk=input.nextDouble();
				System.out.println("���㣺"+(fk-0.8*(m1+m2+m3)));
				break;
			case 3:
				System.out.println("������δ��ͨ!");
				break;
			case 4:
				System.out.println("��ע���ɹ�!");
				System.exit(-1);
		}
	}
}