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
			case 1:
			c=0;
			break;
			case 2:
			c=31;
			break;
			case 3:
			c=59;
			break;
			case 4:
			c=90;
			break;
			case 5:
			c=120;
			break;
			case 6:
			c=151;
			break;
			case 7:
			c=181;
			break;
			case 8:
			c=212;
			break;
			case 9:
			c=243;
			break;
			case 10:
			c=273;
			break;
			case 11:
			c=303;
			break;
			case 12:
			c=334;
			break;
			default:
			System.out.println("������·ݴ���");
		}
		if(b<=31&&b>=1){
			sum=c+b;
			System.out.println("������Ϊ��"+sum);
		}else{
			System.out.println("�շ��������");
		}
	}
}