import java.util.Scanner;

//��д�� StartSMS��ʵ�������û��������룬���������Ľ���ϵͳ
public class StartSMS {
	public static void main(String[] args) {
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("\t1.��½ϵͳ");
		System.out.println("\t2.�˳�ϵͳ");
		System.out.println("*************************");
		Scanner input=new Scanner(System.in);
		System.out.println("����������:");
		int tase=input.nextInt();
		if(tase==1){
			Manager manager=new Manager();
			System.out.println("�������û�����");
			String username=input.next();
			System.out.println("���������룺");
			String password=input.next();
			if(manager.test[0].equals(username)&&manager.test[1].equals(password)){
				index inde=new index();
				inde.showLoginMenu();
			}else{
				
				System.out.println("@@����û��Ȩ�޽���ϵͳ�������µ�½@@");
			}
		}else{
			System.exit(0);
		}
	}
}
