import java.util.Scanner;
/*实现积分回馈功能:金卡客户积分大于 1000 分或普卡客户积分大于 5000，获得回馈
积分 500 分。创建客户对象输出他得到的回馈积分*/
public class Demo02Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Domo02 demo = new Domo02();
		System.out.print("请输入积分：");
		demo.jiFen = input.nextInt();
		System.out.print("请输入卡类型：");

		demo.kaLeiXin = input.next();
		demo.Show();
		if (demo.jiFen > 5000 && demo.kaLeiXin.equals("普通卡")) {
			demo.jiFen += 500;
			System.out.println("回馈积分500分");
		} else if (demo.jiFen > 1000 && demo.kaLeiXin.equals("金卡")) {
			demo.jiFen += 500;
			System.out.println("回馈积分500分");
		} else {
			System.out.println("很遗憾您没有获得积分");
		}
	}
}
