
/*1.�������ع���ϵͳ,ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��*/
import java.util.*;
public class Work08{
	public static void main(String [] agrs){
		System.out.println("**********************************");
		System.out.println("\t��ӭʹ���������ع���ϵͳ");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.print("��ѡ��");
		Scanner in=new Scanner(System.in);
		int a= in.nextInt();
		while(true){
		switch(a)
		{
			case 1:
				System.out.println("**********************************");
				System.out.println("\t��ӭʹ���������ع���ϵͳ");
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				System.out.print("��ѡ��(1-4)");
				int b = in.nextInt();
				switch(b)
				{
					case 1:
						System.out.println("**********************************");
						System.out.println("\t��ӭʹ���������ع���ϵͳ");
						System.out.println("1.��ʾ���пͻ���Ϣ");
						System.out.println("2.��ӿͻ���Ϣ");
						System.out.println("3.�޸Ŀͻ���Ϣ");
						System.out.println("4.��ѯ�ͻ���Ϣ");
						break;
					case 2:
						System.out.println("**********************************");
						System.out.println("\t��ӭʹ���������ع���ϵͳ");
						System.out.println("MyShopping����ϵͳ>�������");
						System.out.println("�����빺�����Ʒ��ţ�");
						System.out.println("1.T��\t2.����Ь\t3.������");
						System.out.println("**********************************");
						double m=0,n=0,o=0;
						String s="n";
						do{
							System.out.print("��������Ʒ��ţ�(1-3)");
							int c=in.nextInt();
							System.out.print("�����빺��������");
							int d=in.nextInt();
							switch(c){
								case 1:
									m=245.0*d;
									System.out.println("1.T��\t��245.0\t����"+d+"\t"+"�ϼƣ�"+m);
									break;
								case 2:
									n=590.0*d;
									System.out.println("2.����Ь\t��590.0\t����"+d+"\t"+"�ϼƣ�"+n);
									break;
								case 3:
									o=200.0*d;
									System.out.println("3.������\t��200.0\t����"+d+"\t"+"�ϼƣ�"+o);
									break;
								default:
									System.out.println("�������������ϵͳ!");
									System.exit(-1);
								
							}
							System.out.println("�Ƿ��������y/n��");
							s=in.next();
						}while(s.equals("y"));
						System.out.println("�ۿ�:0.8!");
						System.out.println("Ӧ����"+0.8*(m+n+o));
						System.out.print("ʵ����");
						double p=in.nextDouble();
						System.out.println("���㣺"+(p-0.8*(m+n+o)));
						break;
					case 3:	
						System.out.println("**********************************");
						System.out.println("\t��ӭʹ���������ع���ϵͳ");
						System.out.println("1.���˴����");
						System.out.println("2.���˳齱");
						System.out.println("3.�����ʺ�");
						break;
					case 4:
						break;
					default :
						System.out.println("�������������ϵͳ!");
						System.exit(-1);
				}
				break;
			case 2:
				System.out.println("лл���ʹ��!");
				System.exit(-1);
				break;
			default:
				System.out.println("�������!����������");
				a= in.nextInt();
			
		}
		}
	}

}