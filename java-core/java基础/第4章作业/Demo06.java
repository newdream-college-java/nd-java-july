/*������� 1 �� 1 �յ��������������*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������ڣ�");
		System.out.print("�������·ݣ�");
		int a=input.nextInt();
		System.out.print("�������շݣ�");
		int b=input.nextInt();
		int c=0,sum=0;
		switch(a){
			case 12:
			c+=30;
			case 11:
			c+=31;
			case 10:
			c+=30;
			case 9:
			c+=31;
			case 8:
			c+=31;
			case 7:
			c+=30;
			case 6:
			c+=31;
			case 5:
			c+=30;
			case 4:
			c+=31;
			case 3:
			c+=28;
			case 2:
			c+=31;
			case 1:
			c+=0;
			break;
			default:
			System.out.println("������·ݴ���");
			break;	
		}
		if(b<=31&&b>=1){
			sum=c+b;
			System.out.println("������Ϊ��"+sum);
		}else{
			System.out.println("�շ��������");
		}
	}
}