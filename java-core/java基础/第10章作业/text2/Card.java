package text2.praJob10;

import java.util.Scanner;

public class Card {
	Scanner inputScanner=new Scanner(System.in);
	int jifen;
	String leixing;
	
	public void shuRu() {
		System.out.print("请输入积分：");
		jifen=inputScanner.nextInt();
		System.out.print("请输入卡类型：");
		leixing=inputScanner.next();
	}
	
	public void show() {
		System.out.println("积分："+jifen+"，卡类型："+leixing);
	}
	
	public void reward() {
		if((leixing.equals("金卡")&&jifen>1000)||(leixing.equals("普卡")&&jifen>5000)) {
			System.out.println("回馈积分500分！");
		}
	}

}
