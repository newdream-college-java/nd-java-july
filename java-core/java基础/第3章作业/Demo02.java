/*����һ����ݣ��ж������껹��ƽ��*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int a=input.nextInt();
		boolean b=true;
		if(a%4==0){
			if(a%400==0){
				System.out.println(a+"��������");
			}else if(a%100!=0){
				System.out.println(a+"��������");
			}else{
				System.out.println(a+"����ƽ��");
			}
		}else{
			System.out.println(a+"����ƽ��");
		}
	}
}