/*2������һ����ݣ��������껹��ƽ��*/
import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int years=input.nextInt();
		if(years%400==0||years%4==0&&years%100!=0){
			System.out.println(years+"������");
		}else{
			System.out.println(years+"��������");
		}
	}
}