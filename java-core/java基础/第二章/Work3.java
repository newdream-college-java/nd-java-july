/*3������һ����λ����������Ҫ���̽������λ���еĸ�λ��ʮλ����λ��ǧλ�ֱ������*/
import java.util.Scanner;
public class Work3{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		int a = x.nextInt();
		if(a>999||a<10000){
			System.out.println("��λΪ��"+a%10);
			System.out.println("ʮλΪ��"+a/10%10);
			System.out.println("��λΪ��"+a/100%10);
			System.out.println("ǧλΪ��"+a/1000%10);
		}else System.out.println("���ݴ���");
	}
}