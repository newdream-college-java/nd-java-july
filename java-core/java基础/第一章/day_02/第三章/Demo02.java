/*2������һ����ݣ��������껹��ƽ��*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int n=in.nextInt();
		if(n%400==0){
			System.out.println("����Ϊ���꣡����");
		}
		if(n%4==0&&n%100!=0){
			System.out.println("����Ϊ���꣡����");
		}else
		System.out.println("���겻�����꣡����");	
	}
}