import java.util.*;
public class LoginMenu{
	public static void main(String[] args){
		System.out.println("********************************************");
		System.out.println("\t\t��ӭʹ���������ع������ϵͳ");
		System.out.println();
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println();
		System.out.println("\t\t2.�˳�");
		System.out.println("********************************************");
		System.out.println("��ѡ����������");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a==1){
			System.out.println("��ѡ����ǵ�¼ϵͳ");
			MainMenu m = new MainMenu();
			m.mainMenu();
		}else
			System.out.println("��ѡ������˳�");
	}
}

