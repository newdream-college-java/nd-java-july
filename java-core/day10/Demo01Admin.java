import java.util.Scanner;

public class Demo01Admin {
	public static void main(String[] args) {
		// ������������Ա�����������ǵ������Ϣ
		Domo01 domo = new Domo01();
		domo.userName = "admin1";
		domo.passWord = "111111";
		Domo01.show(domo);
		Domo01 domo2 = new Domo01();
		domo2.userName = "admin2";
		domo2.passWord = "222222";
		domo2.show();
		// ����ɵ��û��������룬�����ȷ������Ȩ�޸���
		// �Ӽ����ϻ�ȡ�µ����룬���и���
		Scanner input = new Scanner(System.in);
		System.out.print("�������û���:");
		String user = input.next();
		System.out.print("����������:");
		String password = input.next();
		if (user.equals(domo.userName) || password.equals(domo.passWord)) {
			System.out.print("������������:");
			domo.passWord = input.next();
			System.out.println("�޸ĳɹ�������������Ϊ:" + domo.passWord);
		} else {
			System.out.println("�û��������벻ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
		}
	}
}
