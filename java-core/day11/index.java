import java.util.Scanner;
public class index {
/*
 * ʵ��ϵͳ�˵�������˵���ţ����������л������˵�
�˵�������ϵ��������н����ͼ:
 */
	public static void showLoginMenu(){
		//��½�˵�
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("\t1.��½ϵͳ");
		System.out.println("\t2.�˳�");
		System.out.println("*********************");
		Scanner input=new Scanner(System.in);
		System.out.print("��ѡ������:");
		int login=input.nextInt();
		if(login==1){
			MainMenu a=new MainMenu();
			a.showMainMenu();
		}else{
			System.exit(0);
		}
	}
}
