import java.util.Scanner;
import java.util.Random;
public class A6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random  rd = new Random();
		int a;
		int i = 1;
		int c = 0;
		while (i<=3){
		System.out.println("����0 ��ʯͷ");
		System.out.println("����1 ������");
		System.out.println("����2 ����");
		a = sc.nextInt();
		while(a<0 || a>2){
			System.out.print("����������0~2֮�������");
			a = sc.nextInt();
		}
		switch(a){
			case 0:
				System.out.print("�����ʯͷ\t");
				break;
			case 1:
				System.out.print("����ļ���\t");
				break;
			case 2:
				System.out.print("����Ĳ�\t");
				break;
		}
		int b = rd.nextInt(3);
		switch(b){
			case 0:
				System.out.print("���Գ���ʯͷ\t");
				break;
			case 1:
				System.out.print("���Գ��ļ���\t");
				break;
			case 2:
				System.out.print("���Գ��Ĳ�\t");
				break;
		}
		switch(a-b){
			case -1:
				System.out.println("��Ӯ��һ��");
				i++;
				c++;
				break;
			case 0:
				System.out.println("ƽ��");
				break;
			default:
				System.out.println("������һ��");
				i++;
				break;
		}
		}
		if(c>=2){
			System.out.print("��Ӯ��!");
		}else{
			System.out.print("������!");
		}		
	}
}