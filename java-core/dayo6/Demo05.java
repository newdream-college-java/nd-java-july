import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		//循环录入 3 位会员的信息，会员号合法，显示录入信息；否则显示录入失败
		Scanner input=new Scanner(System.in);
		System.out.println("超级大鸡霸管理系统>客户信息管理>添加客户信息\n\n");
		int userName=0;
		String birthday;
		int integral;
		for(int i=1 ;i<=3;i++){
			System.out.print("请输入会员号(<4位整数>):");
			if(input.hasNextInt()){
				userName = input.nextInt();
				if(userName<1000&&userName>=10000){
					System.out.println("显示录入失败");
				}
			}else{
				System.out.println("显示录入失败");
				input=new Scanner(System.in);
			}
			System.out.print("请输入会员生日(月/日<用两整数表示>):");
			birthday=input.next();
			System.out.print("请输入会员积分:");
			integral=input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println(userName+"\t"+birthday+"\t"+integral);
		}
		System.out.print("程序结束！");
	}
}