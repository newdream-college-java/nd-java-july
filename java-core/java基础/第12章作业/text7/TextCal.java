package job01.text7;

import java.util.Scanner;

public class TextCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		CalLi cal=new CalLi();
		System.out.print("请输入贷款金额：");
		double money=scanner.nextDouble();
		System.out.print("请输入贷款年限：");
		int year=scanner.nextInt();
		System.out.print("请输入贷款利率(？元/100元)：");
		double lilv=scanner.nextDouble();
		cal.huanQian(money, lilv, year);
	}

}
