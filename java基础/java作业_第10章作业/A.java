import java.util.*;
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.show();
		A b = new A();
		b.mima();
	}

	public  void show(){
		System.out.println("������admin1,���룺111111");
		System.out.println("������admin2,���룺222222");
	}
	public void mima(){
		Scanner input = new Scanner(System.in);
			System.out.print("�������û�����");
			String a = input.next();
			System.out.print("���������룺");
			String b = input.next();
			if(a.equals("admin1")&&b.equals("111111")){
				System.out.print("�������µ����룺");
				String c = input.next();
				System.out.println("�޸�����ɹ�������������Ϊ��"+c);
			}else if(!a.equals("admin1")||!b.equals("111111")){
				System.out.println("�û�������Ĥ��ƥ�䣡��û��Ȩ�޸��¹���Ա��Ϣ��");
				
			}
	}
}
