/*2������һ����ݣ��������껹��ƽ��*/
import java.util.Scanner;
public class Work2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ����ݣ�\t");
		int year = input.nextInt();
		if(year%400==0){
			System.out.println(year+"��������");
		}else if(year%100!=0&&year%4==0){
			System.out.println(year+"��������");
		}else System.out.println(year+"����ƽ��");		
	}
}