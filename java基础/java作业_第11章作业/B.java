import java.util.*;
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	B a = new B();
	a.cd();
	}
	public void cd(){
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ���������ع������ϵͳ");
		System.out.println("1����¼ϵͳ");
		System.out.println("2���˳�");
		System.out.println("*******************************************");
		System.out.println("��ѡ���������֣�");
		Scanner input =new Scanner(System.in);
		int a = input.nextInt();
		if(a==1){
			System.out.println("�������ع������ϵͳ���˵�");
			System.out.println("*******************************************");
			System.out.println("1���ͻ���Ϣ����");
			System.out.println("2���������");
			System.out.println("*******************************************");
			System.out.println("��ѡ���������ֻ�0������һ���˵���");
			int b = input.nextInt();
			if(b==2){
				System.out.println("�������ع������ϵͳ>�������");
				System.out.println("*******************************************");
				System.out.println("1�����˴����");
				System.out.println("2�����˳齱");
				System.out.println("3�������ʺ�");
				System.out.println("*******************************************");
				System.out.println("��ѡ���������ֻ�0������һ���˵���");
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
			}else
			{
				System.exit(-1);
			}
		}else{
			System.exit(-1);
		}
	}

}
