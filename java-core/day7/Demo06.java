import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("���������");
		int years=input.nextInt();
		System.out.println("�������·�");
		int month=input.nextInt();
		int sum=0;
		for(int i=1900;i<years;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				sum+=366;
			}else{
				sum+=365;
			}
		}
		for(int i=1;i<month;i++){
			if(i==2){
				if(years%4==0&&years%100!=0||years%400==0){
				sum+=29;
				}else{
				sum+=28;
				}
			}else if(i==2||i==4||i==6||i==9||i==11){
				sum+=30;
			}else{
				sum+=31;
			}
		}
		sum+=1;
		System.out.println("\t\t"+years+"��"+month+"��");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=0;i<sum%7;i++){
			System.out.print("\t");
		}
		int a=0;
		if(month==2){
				if(years%4==0&&years%100!=0||years%400==0){
				a+=29;
				}else{
				a+=28;
				}
		}else if(month==2||month==4||month==6||month==9||month==11){
				a+=30;
		}else{
				a+=31;
		}
		for(int i=1;i<=a;i++){
			System.out.print(i+"\t");
			if(sum++%7==6){
				System.out.println();
			}
		}
	}
}