/*1������һ����λ�����������ǲ��ǽ�������:531 
�ǽ����� ��λ>ʮλ>��λ*/
import java.util.Scanner;
public class demo01{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ������");
		int a = input.nextInt();
		int gw=a%10;
		int sw=a/10%10;
		int bw=a/100%10;
		if((bw>sw)&&(sw>gw)){
			System.out.println("�ǽ�����");
		}else{
			System.out.println("���ǽ�����");
		}
		
	}
}