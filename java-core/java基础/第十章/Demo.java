package 第十章;

import java.util.Scanner;

public class Demo {
	public void movePrint() {
		CurrentTime a = new CurrentTime();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入修改时间：");
		String newTime = input.next();
		a.time = newTime;
		a.show();
	}

}
