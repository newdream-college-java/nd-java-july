package chapter12_1;

import java.util.Scanner;

public class TestAccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Account act = new Account();
		int num;
		do{
			System.out.println("1、存款  2、 取款  0、退出");
			System.out.print("请选择你要办理的业务：");
			num = input.nextInt();
			switch(num){
			case 1:
				System.out.print("请输入存款金额：");
				double money1 = input.nextDouble();
				act.save(money1);
				continue;
			case 2:
				System.out.print("请输入取款金额：");
				double money2 = input.nextDouble();
				act.get(money2);
				continue;
			default :
				break;
			}
			
		}while(num == 1 ||num == 2);
		System.out.println("谢谢使用！");
	}

}
