/*1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����*/
import java.util.*;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random r=new Random();
		int count=3,i=0,j=0;
		while(count1!=0){
			System.out.println("���������ѡ�񣺣�0��ʾ��ʯͷ����1��ʾ����������2��ʾ��������");
			int pers=input.nextInt();
			while(pers<0||pers>3){
				System.out.print("���벻��ȷ�����������룺");
				pers=input.nextInt();
			}
			switch(pers){
				case 0:
					System.out.println("������ģ�ʯͷ");
					break;
				case 1:
					System.out.println("������ģ�����");
					break;
				case 2:
					System.out.println("������ģ���");
					break;
			}	
			int comp=r.nextInt(3);
			switch(comp){
				case 0:
					System.out.println("��������ģ�ʯͷ");
					break;
				case 1:
					System.out.println("��������ģ�����");
					break;
				case 2:
					System.out.println("��������ģ���");
					break;
			}
			if(pers-comp==-1||pers-comp==2){
				count--;
				i++;
				System.out.println("��Ӯ�ˣ�");
			}else if(pers-comp==0){
				System.out.println("ƽ�֣�");
			}else{
				count--;
				j++;
				System.out.println("����Ӯ��");
			}
		}
		if(i==2){
			System.out.println("���������յ�ʤ����");
		}else if(j==2){
			System.out.println("���Ի�������յ�ʤ����");
		}
	}
}