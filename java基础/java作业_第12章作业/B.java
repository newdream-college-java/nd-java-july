import java.util.Scanner;


public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B p = new B();
		
		Scanner input = new Scanner(System.in);
		System.out.print("������������");
		String name=input.next();
		System.out.print("�������Ա�");
		String sex=input.next();
		System.out.print("���������䣺");
		int age=input.nextInt();
		
		p.show(name,sex, age);
	}
	public void show(String a,String b,int c){
		System.out.println("--------��Ա��Ϣ--------");
		System.out.println("��Ա��Ϣ���£�");
		System.out.print("������"+a);
		System.out.print("�Ա�"+b);
		System.out.print("���䣺"+c);
	}

}
