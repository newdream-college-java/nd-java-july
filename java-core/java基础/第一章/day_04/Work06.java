/*1.6�����ʵ��һ���򵥵�������ԵĲ�ȭ��Ϸ�����*/
import java.util.*;
public class Work06{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();
	System.out.print("���ȭ��0-ʯͷ��1-������2-��  ������ʤ�ƣ�:");
	int a=1;
	while(a<=3){
		int ren=sc.nextInt();
		if(ren!=0&&ren!=1&&ren!=2){
			System.out.print("�����Ǹ�ɵ�ţ����ȭ��0-ʯͷ��1-������2-��  ��:");
			ren=sc.nextInt();
		}
		int com=rd.nextInt(3);
		switch(ren){
			case 0:
				if(com==0){
					System.out.println("���ǳ��Ķ���ʯͷ��ƽ��Ŷ��");
				}else if(com==1){
					System.out.println("�������ʯͷ�����Գ����Ǽ�������ϲ���ʤ��");
				}else{
					System.out.println("�������ʯͷ�����Գ����ǲ���������Ŷ��");
				}
			break;
			case 1:
				if(com==1){
					System.out.println("���ǳ��Ķ��Ǽ�����ƽ��Ŷ��");
				}else if(com==0){
					System.out.println("������Ǽ��������Գ�����ʯͷ��������Ŷ��");
				}else{
					System.out.println("������Ǽ��������Գ����ǲ�����ϲ���ʤ��");
				}
			break;
			default :
				if(com==2){
					System.out.println("���ǳ��Ķ��ǲ���ƽ��Ŷ��");
				}else if(com==1){
					System.out.println("������ǲ������Գ����Ǽ�����������Ŷ��");
				}else{
					System.out.println("������ǲ������Գ�����ʯͷ����ϲ���ʤ��");
				}
			
		}
		a++;
	}	
	}
}