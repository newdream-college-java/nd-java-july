/*������һ�� int �͵����ݣ��ж��������   ���ܱ� 2 ����������ܱ� 2 ������ 
   ��ô������������ż������������������������������ 
   ��ʾ:8%2==0  10%2==0 
        9%2=1  */

import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
	Scanner input=new Scanner(System.in);
	int i=input.nextInt();
	if(i%2==0){
	System.out.println("�������ż��");
	}else{
	System.out.println("�����������");
	}
	}
}