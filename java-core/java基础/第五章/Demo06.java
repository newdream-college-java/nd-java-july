/*1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����*/
import java.util.Scanner;
import java.util.Random;
public class Demo06{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		int i=0;
		int n=0;
		while(i<2&&n>-2){
			//�˳�ȭ
			System.out.println("���ȭ:(0-ʯͷ��1-������2-��)");
			int ren=input.nextInt();
			switch(ren){
				case 0:
					System.out.println("��������ǣ�ʯͷ");
					break;
				case 1:
					System.out.println("��������ǣ�����");
					break;
				case 2:
					System.out.println("��������ǣ���");
					break;
				default:
					while(!(ren==0||ren==1||ren==2)){
						System.out.println("�����������:(0-ʯͷ��1-������2-��)");
						ren=input.nextInt();
					}
					break;
			}
			//���Գ�ȭ
			int dn=rd.nextInt(3);
			System.out.println(dn);
			switch(dn){
				case 0:
				System.out.println("����������ǣ�ʯͷ");
				break;
				case 1:
				System.out.println("����������ǣ�����");
				break;
				default:
				System.out.println("����������ǣ���");
				break;
			}
			//�ж���Ӯ
			if(ren-dn==-1||ren-dn==2){
				System.out.println("��Ӯ");
				i++;
			}else if(ren-dn==0){
				System.out.println("ƽ��");
			}else{
				System.out.println("����Ӯ");
				n--;
			}
		}
		if(i==2){
			System.out.println("���ս��Ϊ��Ӯ");
		}else{
			System.out.println("���ս��Ϊ����Ӯ");
		}
	}
}