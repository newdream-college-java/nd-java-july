import java.util.Scanner;
public class A5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������0��2֮�������");
		int i = input.nextInt();	
		while(i<=2 && i>=0){
			switch(i){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
					System.out.println("������Ǽ���");
					break;
				case 2:
					System.out.println("������ǲ�");
					break;
			}
			System.out.print("������0��2֮�������");
			i = input.nextInt();
		}
	}
}