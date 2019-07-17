/*���ʵ��������ݣ��·ݣ�Ȼ�������һ����һ�µ�������*/
import java.util.*;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year=input.nextInt();
		System.out.print("�������·ݣ�");
		int month=input.nextInt();
		border(year,month);
	}
	
	public static void border(int year,int month){//���������
		System.out.println("\t\t      "+year+"��"+month+"��\n");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		int sum=0;
		sum=yearNum(year)+monthNum(year,month)+1;
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=day(year,month);i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.println();
			}
			sum++;
		}
	}
	
	public static int yearNum(int year){//��1900-1-1��year-1�������
		int sum=0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		return sum;
	}

	public static int monthNum(int year,int month){//ĳ��1-1��month-1������
		int sum=0;
		for(int i=1;i<month;i++){
			sum+=day(year,i);
		}
		return sum;
	}
	
	public static int day(int year,int month){//ĳ����ĳ���µ�����
		int days=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				days=29;
			}else{
				days=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			days=30;
		}else{
			days=31;
		}
		return days;
	}
}