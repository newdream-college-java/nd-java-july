/*1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����*/
import java.util.Scanner;
import java.util.Random;
public class Work6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int c=0;					//��Stringת��Ϊint
		int ren=0,dn=0;				//�˺͵��Ը���Ӯ�ľ���
		System.out.print("��������Ϸ������");
		int i = sc.nextInt();				//���е���Ч����
		int j = i;					//�����жϾ���ʤ��
		while(i>0){
			System.out.print("����ģ�");
			String a = sc.next();
			int b = rd.nextInt(3);
			if(b==0){
				System.out.println("���Գ��ģ���");
			}else if(b==1){
				System.out.println("���Գ��ģ�����");
			}else if(b==2){
				System.out.println("���Գ��ģ�ʯͷ");
			}
			//���������Stringת��Ϊint
			switch(a){
				case "ʯͷ":
					c = 2;
					break;
				case "����":
					 c = 1;
					break;
				case "��":
					c = 0;
					break;
				default:
					break;
			}
			//ʤ���ж�
			if(c==b){
				System.out.println("ƽ��"+"\n ");
			}else if(c==0&&b==2){
				System.out.println("��Ӯ�ˣ�"+"\n ");
				ren++;
				--i;
			}else if(c==2&&b==0){
				System.out.println("�����ˣ�"+"\n ");
				dn++;
				--i;
			}else if(c>b){
				System.out.println("��Ӯ�ˣ�"+"\n ");
				ren++;
				--i;
			}else{
				System.out.println("�����ˣ�"+"\n ");
				dn++;
				--i;
			}
			//
			if(ren==(j/2+1)||dn==(j/2+1)){
				if(ren==(j/2+1)){
					System.out.println(j+"��"+(j/2+1)+"ʤ�ƣ�����Ӯ�����㣡����ϲ����");
					System.exit(-1);
				}else
					System.out.println(j+"��"+(j/2+1)+"ʤ�ƣ�����Ӯ�ҵ��ԣ��ѿ�����");
					System.exit(-1);
			}
		}
	}
}