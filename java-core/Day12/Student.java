import java.util.Scanner;

/**
 * �޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�
 * 
 * @author 54975
 * 
 */
public class Student {
	String[] array = new String[5];
	boolean fals = false;

	public void addStudent(String name) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				fals = true;
				array[i] = name;
				break;
			}
		}
		if (!fals) {
			System.out.println("��������");
			return;
		}
	}

	public void show() {
		System.out.println("*****************************");
		System.out.println("\t �ͻ������б�");
		System.out.println("*****************************");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public void updata(String name, String updataname) {
		System.out.println("********�޸Ľ��*********");
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(name)) {
				fals = true;
				array[i] = updataname;
				System.out.println("�ҵ����޸ĳɹ�");
				break;
			}
		}
		if (!fals) {
			System.out.println("û�ҵ��޸�ʧ��");
			return;
		}
	}
	public static void main(String[] args) {
		Student s=new Student();
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("������ͻ�����:");
			String name=input.next();
			s.addStudent(name);
		}
		s.show();
		System.out.println();
		System.out.print("������Ҫ�޸ĵ��û�����");
		String name=input.next();
		System.out.print("������Ҫ��ӵ����û�����");
		String updataname=input.next();
		s.updata(name, updataname);
		s.show();
	}
}
