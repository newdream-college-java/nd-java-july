/*���ʵ��������ݣ��·ݣ�Ȼ�������һ����һ�µ�������*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year=input.nextInt();
		System.out.print("�������·ݣ�");
		int month=input.nextInt();
		//��1900��1��1�ŵ���������������������
		int total=0;
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				total+=366;
			}else{
				total+=365;
			}
		}
		//��������е������·ݵ�1�����µ�����
		int days=0;
		for(int i=1;i<month;i++){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					days+=29;
				}else{
					days+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				days+=30;
			}else{
				days+=31;
			}
		}
		int sum=total+days+1;
		//��ӡ����
		System.out.println("\t\t\t"+year+"��"+month+"��\n");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		//��1�ŵ�λ��
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		//�ж������·��ж�����
		int mDays=0;
		if(month==2){
			if(year%4==0&&year%100!=0||year%400==0){
				mDays=29;
			}else{
				mDays=28;
			}
		}else if(month==4||month==6||month==9||month==11){
			mDays=30;
		}else{
			mDays=31;
		}
		for(int i=1;i<=mDays;i++){
			System.out.print(i+"\t");
			if(sum%7==6){
				System.out.print("\n");
			}
			sum++;
		}
	}
}