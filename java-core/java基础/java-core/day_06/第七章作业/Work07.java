/*2.1���ʵ��������ݣ��·ݣ�Ȼ�������һ����һ�µ�������1900��1.1������һ*/
import java.util.Scanner;
public class Work07{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year=sc.nextInt();
		System.out.print("�������·ݣ�");
		int month =sc.nextInt();
		int sum=0;
		//���������
		for(int i=1900;i<year;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){
				sum+=366;
			}else {
				sum+=365;
			}
			
		}
		//���µ�����
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%100==0||(year%4==0&&year%100!=0)){
					sum+=29;
				}else{
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				sum+=30;
			}else {
				sum+=31;
			}	
		}
		sum+=1;
		System.out.println("\t\t\t"+year+"��"+month+"��");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		int days =0;//����µ�������
		if(month==2){
				if(year%100==0||(year%4==0&&year%100!=0)){
					days=29;
				}else{
					days=28;
				}
			}else if(month==4||month==6||month==9||month==11){
				days=30;
			}else {
				days=31;
			}
		for(int i=1;i<=days;i++){//i��ʾ����
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.println();
			}
			//sum++;
		}
		
		
	}
}
