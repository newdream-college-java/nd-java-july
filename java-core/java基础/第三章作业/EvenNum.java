/*6������һ�� int �͵����ݣ��ж�������� ���ܱ� 2 ����������ܱ� 2 ��������ô������������ż������������������������������*/
import java.util.Scanner;
public class EvenNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������������");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println(a+"��ż��");
		}else{
			System.out.println(a+"������");	
		}
		
	}
}