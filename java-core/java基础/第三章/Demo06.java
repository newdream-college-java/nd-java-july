/*
6������һ�� int �͵����ݣ��ж��������   ���ܱ� 2 ����������ܱ� 2 ������ 
   ��ô������������ż������������������������������ 
   ��ʾ:8%2==0  10%2==0 
        9%2=1 
*/
import java.util.*;
public class Demo06{
	public static void main(String [] args){
		System.out.println("������һ��int�͵�����");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a%2==0)
		System.out.print("�������ż��");
		else
		System.out.print("�����������");
	}
}