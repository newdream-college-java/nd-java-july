/*����һ����ݣ��������껹��ƽ��*/
import java.util.Scanner;
public class A2{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ�����");				
		int a = input.nextInt();
		if(a%4 == 0){
			System.out.print("������������");
		}else{
			System.out.print("��������ƽ��");
		}
	}
}