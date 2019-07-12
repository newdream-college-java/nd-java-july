import java.util.Scanner;
import java.util.Random;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t欢迎使用超级大几把购物管理系统");
		System.out.println("\t\t\t1.登陆");
		System.out.println("\t\t\t2.推出");
		System.out.println("************************************************************");
		System.out.println("请选择，请输入数字:");
		int score=input.nextInt();
		switch(score){
			case 1:
			System.out.println("\t\t欢迎使用超级大几把购物管理系统");
			System.out.println("************************************************************");
			System.out.println("\t\t\t1.客户信息管理");
			System.out.println("\t\t\t2.购物结算");
			System.out.println("\t\t\t3.真情回馈");
			System.out.println("\t\t\t4.注销");
			System.out.println("************************************************************");
			System.out.println("请选择，请输入数字：");
			score=input.nextInt();
			switch(score){
				case 1:
				System.out.println("大鸡霸购物管理系统>客户信息管理");
				System.out.println("1.显示所有客户信息");
				System.out.println("2.添加所有客户信息");
				System.out.println("3.修改所有客户信息");
				System.out.println("4.查询所有客户信息");
				break;
				case 2:
				break;
				case 3:
				System.out.println("大鸡霸购物管理系统>真情回馈");
				System.out.println("1.幸运大放送");
				System.out.println("2.幸运抽奖");
				System.out.println("3.生日问候");
				System.out.println("请选择，请输入数字：");
				score=input.nextInt();
				switch(score){
					case 1:
					break;
					case 2:
					System.out.print("超级大鸡霸购物管理系统 > 幸运抽奖\n");
					System.out.print("请输入4位会员号：");
					int data=input.nextInt();
					String code="";
					Random random=new Random();//申明随机类
					for(int i=1;i<=6;i++){
						code+=random.nextInt(10);
					}
					System.out.println("产生的随机数是"+code);
					code=code.substring(2,6);
					System.out.println("产生的随机数后四位是"+code);
					int a=Integer.parseInt(code);//转换为整数类型
					if(a==data){
						System.out.println(data+"号客户是幸运客户，获得奖金");
					}else{
						System.out.println(data+"号客户,谢谢您的支持！");
					}
					break;
					case 3:
					break;
					default:
					System.out.println("输入错误");
					return;
				}
				break;
				case 4:
				break;
				default:
				System.out.println("输入错误");
				break;
			}
			return;
			default:
			System.out.println("已退出");
			break;
		}
	}
}