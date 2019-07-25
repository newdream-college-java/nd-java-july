import java.util.Scanner;


public class Pay {
	double lixi=0.02;//假定利息
	public void monthPay(double a,int year){
		double zLx=a*lixi;
		double mp=(a+a*lixi)/year;
		System.out.println("总利息为"+zLx+"月还款"+mp);
	}
	public static void main(String[] args) {
		Pay a=new Pay();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入贷款金额");
		double money=sc.nextDouble();
		System.out.println("请输入贷款年限");
		int year=sc.nextInt();
		a.monthPay(money, year);
	}
}
