/*����һ��0-2��������ʯͷ0   ����1  �� 2��������*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int a=input.nextInt();
		while(a>=0&&a<=2){
			switch(a){
				case 0:
				System.out.println("�������ʯͷ");
				break;
				case 1:
				System.out.println("������Ǽ���");
				break;
				default:
				System.out.println("������ǲ�");
			}
			System.out.print("������һ��ֵ��");
			a=input.nextInt();
		}
		System.out.println("��������˳����򣡣���");
		System.exit(-1);
	}
}