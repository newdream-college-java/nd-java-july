//��ӡ������
import java.util.*;
public class Demo07{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = input.nextInt();
		System.out.println("�������·�");
		int month = input.nextInt();
		//�ж������·�1�������ڼ���
		//1900 1-1����һ 
		//��1900�굽������ݵ���������������������·�����%7
		int sum =0;
		//����
		for(int i =1900;i<year;i++){
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
		sum+=1;
		//System.out.print(sum%7);
		//��ӡ1��λ��
		System.out.println("\t\t\t"+year+"��"+month+"��\n");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//����������ж�����
		int days=0;
			if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){
					days=29;
				}
				else
				days=28;
			}else if(month==4||month==6||month==9||month==11){
				days=30;
			}else{
			days=31;
			}
		//��ӡ
		for(int i =1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.print("\n");
			}
		}
		
	}
}