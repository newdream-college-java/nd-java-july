import java.util.Scanner;


public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D p = new D();
		p.show();
	}
	public void show(){
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1����¼ϵͳ");
		System.out.println("2���˳�");
		System.out.println("*******************************************");
		System.out.print("��ѡ���������֣�");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			System.out.print("�������û�����");
			String b = input.next();
			System.out.print("���������룺");
			int c = input.nextInt();
			if(b.equals("newdream")&&c==0000){
				C d = new C();
				d.ShowMainMenu();
			}else {
				System.out.println("@@��û��Ȩ�޽���ϵͳ�����µ�¼��@@");
				D g = new D();
				g.show();
			}
		}else {
			System.exit(-1);
		}
	}
}
