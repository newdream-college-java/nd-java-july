import java.util.Scanner;
public class G{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������ݣ�");	
		int a = input.nextInt();
		System.out.println("�������·ݣ�");
		int b = input.nextInt();
		int sum=0;
		for(int i=1900;i<a;i++){//���1900�굽���ڵ�������
		if(i%4==0&&i%100!=0||i%400==0){ //����������������
		sum+=366;  
		}else {
		sum+=365;
		}
		}
		for(int i =1;i<b;i++){
					if(i==2){
					if(a%4==0&&a%100!=0||a%400==0){
							sum+=29;
							}else 
							{
							sum+=28;
							}
						}else if(i==4||i==6||i==9||i==11){
							sum+=30;
						}else {
							sum+=31;
						}
						}
		sum+=1;
		System.out.println(sum%7);
		System.out.println("\t\t\t"+a+"��"+b+"��");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		for(int i=1;i<=sum%7;i++){
		System.out.print("\t");
			}
		int days = 0;
		if(b==2){
		if(a%4==0&&a%100!=0||a%400==0){
		days=29;
			}else {
		days=28;
			}
			}else if(b==4||b==6||b==9||b==11){
			days=30;
			}else {
			days=31;
			}
			for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum++%7==6){
			System.out.println();
			}
		}
}
}				