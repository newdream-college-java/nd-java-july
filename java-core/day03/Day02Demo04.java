import java.util.Scanner;
public class Day02Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//6������һ�� int �͵����ݣ��ж�������� ���ܱ� 2 ����������ܱ� 2 ������
		//��ô������������ż��������������������������������ʾ:8%2==0 10%2==0 9%2=1
		System.out.println("������һ��int���͵�������");
		int data=input.nextInt();
		if(data%2==0){
			System.out.println("����һ������");
		}else{
			System.out.println("����һ������");
		}
		
	}
}