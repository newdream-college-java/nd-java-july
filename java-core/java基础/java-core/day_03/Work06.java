/*2.5�� ������� 1 �� 1 �յ��������������*/
import java.util.*;
public class Work06{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������������ڣ��·�1-12 ���� 1-31����");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==1){
			System.out.println("��������"+b);
		}else if(a==2){
			System.out.println("��������"+(b+31));			

		}else if(a==3){
			System.out.println("��������"+(b+59));
		}else if(a==4){
			System.out.println("��������"+(b+90));			
		}else if(a==5){
			System.out.println("��������"+(b+120));
		}else if(a==6){
			System.out.println("��������"+(b+151));			
		}else if(a==7){
			System.out.println("��������"+(b+181));
		}else if(a==8){
			System.out.println("��������"+(b+212));			
		}else if(a==9){
			System.out.println("��������"+(b+243));
		}else if(a==10){
			System.out.println("��������"+(b+273));
		}else if(a==11){
			System.out.println("��������"+(b+304));			
		}else if(a==12){
			System.out.println("��������"+(b+334));
		}
	}
}
