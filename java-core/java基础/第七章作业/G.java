/*	
	���ʵ��������ݣ��·ݣ�Ȼ�������һ����һ�µ�������
*/

import java.util.Scanner;

public class G{
	public static void main (String [] args){
		Scanner input =new Scanner(System.in);
		int sum=0;
		System.out.print("��������ݣ�");
		int year=input.nextInt();
		System.out.print("�������·ݣ�");
		int month=input.nextInt();
		//�����1900�굽������ж�����
		for(int i=1900;i<year;i++){
			if(i%400==0||i%4==0&&i%100!=0){
				sum=sum+366;
			}else{
				sum=sum+365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%400==0||year%4==0&&year%100!=0){
					sum=sum+29;
				}else{
					sum=sum+28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum=sum+30;
			}else{
				sum=sum+31;
			}
		}
		System.out.println("�ܹ�����Ϊ��"+sum);
		sum=sum+1;
		int week=sum%7;
		System.out.println("���·ݵ�һ��������"+week);
		//�ƶ������ı��
		System.out.println("\t\t\t"+year+"��"+month+"��\n");
		System.out.println("��\tһ\t��\t��\t��\t��\t��\n");
		//���������·ݵ�����
		int day=0;
		if(month==2){
			if(year%400==0||year%4==0&&year%100!=0){
				day=29;
			}else{
				day=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			day=30;
		}else{
			day=31;
		}
		//�ж�1�Ŵӱ����ĸ�λ�ÿ�ʼ
		for(int i=week;i>0;i--){
			System.out.print("\t");
		}
		//��ӡ��������
		for(int i=1;i<=day;i++){
			System.out.print(i+"\t");
			week++;
			if(week%7==0){
				System.out.println();
			}
		}	
	}
}