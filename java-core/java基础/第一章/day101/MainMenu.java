import java.util.*;
public class MainMenu{
	public void mainMenu(){
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println();
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println();
		System.out.println("\t\t2.�������");
		System.out.println();
		System.out.println("\t\t3.�������");
		System.out.println();
		System.out.println("\t\t4.ע��");
		System.out.println("**********************************************");
		System.out.println("��ѡ����������");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1){
			System.out.println("��ѡ����ǿͻ���Ϣ����");
		}else if(a==2)
			System.out.println("��ѡ����ǹ������");
		else if(a==3)
			System.out.println("��ѡ������������");
		else 
			System.out.println("��ѡ�����ע��");
	}
}
