import java.util.Scanner;

/**
 * 模拟银行账户业务：编写 Account 类，添加带参方法实现存款和取款业务，存款初
 *	始 0 元，取款时需要判断余额是否充足，如图:
 * @author 54975
 *
 */
public class Account {
	double sum=0;
	public void addmonth(double month){
		sum+=month;
		System.out.println("存款成功");
		System.out.println("***当前余额为："+sum+"元***");
	}
	public void getMonth(double month){
		if(sum>month){
			sum-=month;
			System.out.println("取款成功");
			System.out.println("***当前余额为："+sum+"元***");
		}else{
			System.out.println("取款失败");
			System.out.println("***当前余额为："+sum+"元***");
		}
	}
	public static void main(String[] args) {
		Account a=new Account();
		Scanner input=new Scanner(System.in);
		for(;;){
			System.out.println("1.存款\t2.取款\t0.退出");
			System.out.print("请选择你需要办理的业务:");
			int c=input.nextInt();
			if(c==1){
				System.out.print("请输入存款金额:");
				double month=input.nextDouble();
				a.addmonth(month);
			}else if(c==2){
				System.out.print("请输入取款金额:");
				double month=input.nextDouble();
				a.getMonth(month);
			}else{
				System.out.println("谢谢使用");
			}
		}
	}
}
