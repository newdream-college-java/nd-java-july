import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A p = new A();
		p.show();
	}

	String[] c = new String[5];

	public void show() {
		Scanner input = new Scanner(System.in);
		int d = 0;
		for (int i = 0; i < c.length; i++) {

			System.out.print("������ͻ���������");
			String a = input.next();
			c[i] = a;
			d++;
			System.out.print("���������𣿣�y/n����");
			String b = input.next();

			if (b.equals("n")) {

				break;
			}
		}

		System.out.println("*****************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("*****************************");
		for (int i = 0; i < d; i++) {
			System.out.print(c[i] + "\t");
		}
	}

	public void xg(String name) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		for (int i = 0; i < c.length; i++) {
		
			if (c[i].equals(name)) {
				flag = true;
				System.out.println("�������µĿͻ�������");
				String n = input.next();
				c[i]=n;
				System.out.println("******�޸Ľ��******");
				System.out.println("�ҵ����޸ĳɹ���");
				break;
			}
		}
		if (!flag) {
			System.out.println("δ�ҵ�����ˣ�");
		}
	}
	public void cx(){
		System.out.println("*****************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("*****************************");
		for(int i=0;i<c.length;i++){
			if(c[i]!=null){
				System.out.println(c[i]+"\t");
			}
		}
	}

}
