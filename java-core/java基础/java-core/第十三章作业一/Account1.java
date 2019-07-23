package chapter_13_1;
/*1.4模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
始 0 元，取款时需要判断余额是否充足，如图:*/
import java.util.*;
public class Account1 {
	double oldMoney;
	public void menu(){
		System.out.println("1.存款\t2.取款\t0.退出");
		System.out.print("请输入你需要办理的业务：");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		switch(x){
			case 1:
				System.out.print("请输入你要存的金额：");
				double jine1=sc.nextDouble();
				cun(jine1);
				break;
			case 2:
				System.out.print("请输入你要取的金额：");
				double jine2=sc.nextInt();
				qu(jine2);
				break;
			case 0:
				System.out.println("谢谢使用！");
				System.exit(-1);
			default:
				System.out.println("输入错误，请重新选择！");
				
		}	
	}
	public void cun(double jine){	
		System.out.println("存款成功！");
		System.out.println();
		oldMoney+=jine;
		System.out.println("***当前余额为："+oldMoney);
	}
	public void qu(double jine){
		if(oldMoney>=jine){
			System.out.println("取款成功！");
			oldMoney-=jine;
			System.out.println("***当前余额为："+oldMoney);
			System.out.println();
		}else{
			System.out.println("余额不足！请重新选择！");
		}
	}
	public static void main(String[] args) {
		Account1 a=new Account1();
		a.oldMoney=800;
		while(true){
			a.menu();
		}
		
		
	}

}
