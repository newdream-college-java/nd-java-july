/*
1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ���
*/
import java.util.*;
public class Demo06 {
	public static void main(String[] args){
		System.out.println("������һ��0-2��������0Ϊʯͷ��1Ϊ������2Ϊ��");
		Scanner input = new Scanner(System.in);
		Random rd=new Random();
		int a = input.nextInt();
		int sum1=0,sum2=0;
		while(true){
			while(a<0||a>2){
			System.out.println("�������!���������룺");
			a = input.nextInt();
			}
			switch(a){
				case 0:
					System.out.println("�������ʯͷ");
					break;
				case 1:
				System.out.println("������Ǽ���");
				break;
				case 2:
					System.out.println("������ǲ�");
					break;
				default:
					break;
			}
			int dn = rd.nextInt(3);
			switch(dn){
				case 0:
					System.out.println("���Գ�����ʯͷ");
					break;
				case 1:
					System.out.println("���Գ����Ǽ���");
					break;
				case 2:
					System.out.println("���Գ����ǲ�");
					break;
			}
			int result =a-dn;
			//�ж���Ӯ
			if(result==-1||result==2){
				System.out.println("��ϲ��Ӯ��һ�֣�");
				sum1=sum1+1;
			}
			else if(result==0){
				System.out.println("ƽ��");
			}
			else{
				System.out.println("����Ӯ��һ�֣�");
				sum2=sum2+1;
			}
			//������ʤ�ж�
			if(sum1<2){
				if(sum2<2){
					a = input.nextInt();
				}
				else{
					System.out.print("����Ӯ��ʤ����");
					System.exit(0);
				}
			}
			else{
				System.out.print("��ϲ��Ӯ��ʤ����");
				System.exit(0);
			}
		}
			
	}
}