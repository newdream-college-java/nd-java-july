/*1.�������ع���ϵͳ*/
import java.util.*;
public class Demo06{
	public static void main(String [] agrs){
		System.out.println("**********************************");
		System.out.println("\t��ӭʹ���������ع���ϵͳ");
		System.out.println("\t1.��¼ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.println("��ѡ��");
		Scanner in=new Scanner(System.in);
		int a= in.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("**********************************");
				System.out.println("\t��ӭʹ���������ع���ϵͳ");
				System.out.println("1.�ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("3.�������");
				System.out.println("4.ע��");
				System.out.println("��ѡ��");
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
						System.out.println("1.��ѡ��֧����ʽ");
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
				}
				break;
			case 2:
				System.out.println("лл���ʹ��!");
				break;
			default:
				System.out.println("�������!");
				break;
		}
	}

}