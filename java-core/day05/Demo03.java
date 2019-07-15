import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("\t\t欢迎使用超级大几把购物管理系统");


 
			System.out.println("************************************************************");


 
			System.out.println("\t\t\t1.客户信息管理");


 
			System.out.println("\t\t\t2.购物结算");


 
			System.out.println("\t\t\t3.真情回馈");


 
			System.out.println("\t\t\t4.注销");


 
			System.out.println("************************************************************");


 
			System.out.println("请选择，请输入数字：");
			int score;
			score=input.nextInt();
			while(score>3||score<1){
				System.out.println("请选择，请输入数字：");
				score=input.nextInt();
			}
			
			switch(score){
				case 1:
				break;
				case 2:
			
		//循环输入商品编号，显示对应的商品价格，输入“n”结束循环
		System.out.println("MyShopping管理系统\t>\t购物结算\n");
		System.out.println("****************************************************\n");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("****************************************************\n");
		
		int data;
		double sum=0;
		String b="";
		do{
		do{
			System.out.print("请输入商品编号：");
			if(!input.hasNextInt()){
				System.out.println("只能输入数字逗逼");
				System.exit(-1);
			}
			data=input.nextInt();
			System.out.print("请输入商品数量：");
			int sub=input.nextInt();
			switch(data){
				case 1:
					sum=sub*245.0;
					System.out.println("T恤\t￥"+sum);
					break;
				case 2:
					sum=sub*550.0;
					System.out.println("网球鞋\t￥"+sum);
					break;
				case 3:
					sum=sub*680.0;
					System.out.println("网球拍\t￥"+sum);
					break;
				default:
					System.out.println("输入的数据有误，请从新输入");
			}
		}while(data>3||data<1);
		
			System.out.println("是否继续(y/n)");
			b=input.next();
			if(!b.equals("y") && !b.equals("n")){
				System.out.println("输入有误请重新是输入：");
			}
			if(b.equals("n")){
				System.out.println("程序结束");
			}
		}while(b.equals("y") && !b.equals("n"));
		System.out.println("折扣：0.8");
		System.out.println("应付金额："+sum);
		System.out.print("实付金额：");
		double iop=input.nextDouble();
		System.out.println("找钱："+(iop-sum));
		break;
		case 3:
			break;
		case 4:
			break;
		}
	}
}