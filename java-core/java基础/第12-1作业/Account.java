import java.util.Scanner;


public class Account {
	double money=0;
	Scanner sc=new Scanner (System.in);
	public void mainMenu(){
		System.out.println("1.存款 2.取款 0.退出");
		System.out.println("请选择你需要办理的业务");
		int a=sc.nextInt();
		while(a!=1&&a!=2&&a!=0){
			System.out.println("输入错误");
			System.out.println("请选择你需要办理的业务");
			a=sc.nextInt();
		}
		switch(a){
		case 0:
			System.out.println("谢谢您的使用");
			break;
		case 1:
			System.out.print("请输入存款金额");
			double b=sc.nextDouble();
			chu(b);
			break;
		case 2:
			System.out.print("请输入取款金额");
			double c=sc.nextDouble();
			qu(c);
		}
	}
	public void chu(double a){
		money+=a;
		System.out.println(money);
		mainMenu();
	}
	public void qu(double b){
		if(b>money){
			System.out.println("您的账户余额不足");
			mainMenu();
		}else{
			money-=b;
			System.out.println(money);
			mainMenu();
		}
	}
	public static void main(String[] args) {
		Account acc=new Account();
		acc.mainMenu();
	}

}
