import java.util.*;
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
			a.ka();
	}
	public void ka(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����뿨�����ͣ��𿨣��տ�����");
		String a = input.next();
		System.out.print("��������Ļ��֣�");
		int b = input.nextInt();
		if(a.equals("��")&&b>1000){
			System.out.println("�������֣�500�֣�");
		}else if(a.equals("��")&&b<1000){
			System.out.println("��Ǹ��û�л������֣�");
		}else if(a.equals("�տ�")&&b>5000){
			System.out.println("�������֣�500�֣�");
		}else if(a.equals("�տ�")&&b<5000){
			System.out.println("��Ǹ��û�л������֣�");
		}
	}
}
