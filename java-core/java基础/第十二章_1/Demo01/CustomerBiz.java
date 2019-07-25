package chapter12_1;

import java.util.Scanner;

public class CustomerBiz {
	Scanner input = new Scanner(System.in);
	String[] custs = new String[100];
	int count = 0;// 添加的人数

	public void add() {
		for (int i = 0; i < custs.length; i++) {
			count++;
			System.out.print("请输入客户姓名：");
			custs[i] = input.next();
			System.out.println("继续输入吗？（y/n）:");
			String answer = input.next();
			if(answer.equals("n")){
				break;
			}
		}
	}
	public void showCusts(){
		System.out.println("*********************");
		System.out.println("       客户姓名列表");
		System.out.println("*********************");
		for(int i = 0;i<count;i++){
			System.out.print(custs[i]+"   ");
		}
	}
}
