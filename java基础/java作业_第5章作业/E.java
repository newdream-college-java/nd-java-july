import java.util.Scanner;
public class E{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("���ȭ��(0��ʯͷ��1������; 2����)");
		int a = input.nextInt();
		switch(a){
		case 0:
			System.out.println("�������ʯͷ");
			break;
		case 1:
			System.out.println("������Ǽ���");
			break;
		case 2:
			System.out.println("������ǲ�");
			break;
		default:
			System.exit(-1);
		}
		
}
}