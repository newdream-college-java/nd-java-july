import java.util.*;


public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.ShowLoginMenu();
	}
	public void ShowLoginMenu(){
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1����¼ϵͳ");
		System.out.println("2���˳�");
		System.out.println("*******************************************");
		System.out.print("��ѡ���������֣�");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			C c = new C();
		c.ShowMainMenu();	
		}else{
			System.exit(-1);
		}
	}
	public void ShowMainMenu(){
		System.out.println("�������ع������ϵͳ���˵�");
		System.out.println("*******************************************");
		System.out.println("1���ͻ���Ϣ����");
		System.out.println("2���������");
		System.out.println("*******************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		Scanner input =new Scanner(System.in);
		int b = input.nextInt();
		if(b==2){
			C c= new C();
			c.ShowSendGMenu();
		}else if(b==1){
			C c= new C();
			c.ShowCustMenu();
		}
	}
	public void ShowCustMenu(){
		System.out.println("�������ع���ͻ���Ϣ����˵�");
		System.out.println("�ͻ��û���Ϊ��newdream\t����Ϊ��0000");
	}
	public void ShowSendGMenu(){
		System.out.println("�������ع������ϵͳ>�������");
		System.out.println("*******************************************");
		System.out.println("1�����˴����");
		System.out.println("2�����˳齱");
		System.out.println("3�������ʺ�");
		System.out.println("*******************************************");
		System.out.print("��ѡ���������ֻ�0������һ���˵���");
		Scanner input =new Scanner(System.in);
		int c = input.nextInt();
		switch(c){
		case 1:
			System.out.println("ִ�����˴����");
			break;
		case 2:
			System.out.println("ִ�����˳齱");
			break;
		case 3:
			System.out.println("ִ�������ʺ�");
			break;
		}
	}
}
