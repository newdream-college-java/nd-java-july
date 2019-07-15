/*
老师每天检查张浩的学习任务是否合格，如果不合格，则继续进行。
老师给张浩安排的每天的学习任务为：上午阅读教材，学习理论部分，下午上机编程，掌握代码部分。
*/
import java.util.Scanner;
public class Demo12{
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		//提示
		System.out.print("是否合格：");//合格、不合格
		String hd = input.next();
		while(!hd.equals("合格")){
			//上午阅读教程 学理论
			System.out.println("上午阅读教程 学理论");
			//下午上机写代码
			System.out.println("下午上机写代码");
			//继续问
			System.out.print("是否合格：");//合格、不合格
			hd = input.next();
		}

		//do-while循环
		




	}
}