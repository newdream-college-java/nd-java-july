/*�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
 */

import java.util.*;

public class F{
	public static void main(String[ ] args){
		int i=1,j=0,l=0;
		while(j<2){
			System.out.println("��ѡ����Ĳ�ȭ��0.ʯͷ��1.������2.��");
			Scanner input=new Scanner(System.in);
			int a = input.nextInt();
			while(a>2){
				System.out.print("���������룺");
				a = input.nextInt();
			}
			switch(a){
				case 0:
					System.out.println("���ѡ����ʯͷ");
					break;
				case 1:
					System.out.println("���ѡ���Ǽ���");
					break;
				case 2:
					System.out.println("���ѡ���ǲ�");
					break;
			}
			Random dn=new Random();
			int b =dn.nextInt(3);
			switch(b){
				case 0:
					System.out.println("���Ե�ѡ����ʯͷ");
					break;
				case 1:
					System.out.println("���Ե�ѡ���Ǽ���");
					break;
				case 2:
					System.out.println("���Ե�ѡ���ǲ�");
					break;
			}
			System.out.println("��"+i+"�غ�");
			if(a-b==0){
				System.out.println("ƽ��\n\n");
			}else if(a-b==2||b-a==1){
				System.out.println("���ʤ\n\n");
				i++;
				j++;
				if(j==2)
				System.out.println("������ʤ�Ľ�������ʤ");
			}else{
				System.out.println("���Ի�ʤ\n\n");
				i++;
				l++;
				if(l==2)
				System.out.println("������ʤ�Ľ���ǵ��Ի�ʤ");
			}
		}
	}
}