/*2������һ����ݣ��������껹��ƽ��*/
import java.util.Scanner;
public class demo02{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int a = input.nextInt();
		if(a%100==0){
			if(a%400==0){
				System.out.println("������");
			}else{
				System.out.println("��ƽ��");
			}
		}else if(a%4==0){
			System.out.println("������");
		}else{
			System.out.println("��ƽ��");
		}
		
	}
}