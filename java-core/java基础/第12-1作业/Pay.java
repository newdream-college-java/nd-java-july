import java.util.Scanner;


public class Pay {
	double lixi=0.02;//�ٶ���Ϣ
	public void monthPay(double a,int year){
		double zLx=a*lixi;
		double mp=(a+a*lixi)/year;
		System.out.println("����ϢΪ"+zLx+"�»���"+mp);
	}
	public static void main(String[] args) {
		Pay a=new Pay();
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������");
		double money=sc.nextDouble();
		System.out.println("�������������");
		int year=sc.nextInt();
		a.monthPay(money, year);
	}
}
