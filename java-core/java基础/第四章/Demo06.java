/*
������� 1 �� 1 �յ������������
*/
import java.util.*;
public class Demo06{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = input.nextInt();
		System.out.println("�������·ݣ�");
		int month = input.nextInt();
		System.out.println("�������գ�");
		int days= input.nextInt();
		int sum =0;
		for(int i =2019;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}
			else{
				sum+=365;
			}
		}
		//����
		for(int i =1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					sum+=29;
				}
				else
				sum+=28;
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
			sum+=31;
			}
		}
		sum+=days-1;
		System.out.print("������Ϊ��"+sum);
	}
}
