/*2.5�� ������� 1 �� 1 �յ��������������*/
import java.util.Scanner;
public class CountDay{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("�����뵱ǰ�·ݣ�");
		int a=input.nextInt();
		System.out.print("�����뵱��������");
		int sum=input.nextInt();
		if(sum>0&&sum<32){
			switch(a){
 				case 12:
					sum+=30;
 				case 11:
					sum+=31;
 				case 10:
					sum+=30;
 				case 9:
					sum+=31;
 				case 8:
					sum+=31;
 				case 7:
					sum+=30;
 				case 6:
					sum+=31;
 				case 5:
					sum+=30;
 				case 4:
					sum+=31;
 				case 3:
					sum+=28;
 				case 2:
					sum+=31;
				case 1:
					break;
				default:
					System.out.println("�·���������");
			}
			System.out.println("������Ϊ��"+sum);
		}
		else{
			System.out.println("�������������");
		}		
	}
}		