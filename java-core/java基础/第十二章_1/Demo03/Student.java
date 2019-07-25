package chapter12_1;

import java.util.Scanner;

public class Student {
	String name;

	Scanner input = new Scanner(System.in);
	String[] stus = new String[100];
	int count = 0;// 添加的人数

	public void add() {
		for (int i = 0; i < stus.length; i++) {
			count++;
			System.out.print("请输入客户姓名：");
			stus[i] = input.next();
			System.out.print("继续输入吗？（y/n）:");
			String answer = input.next();
			if (answer.equals("n")) {
				break;
			}
		}
	}

	public void showStus() {
		System.out.println("*********************");
		System.out.println("       客户姓名列表");
		System.out.println("*********************");
		for (int i = 0; i < count; i++) {
			System.out.print(stus[i] + "   ");
		}
		System.out.println();
	}
	
	boolean flag = false;
	public void modify(String name1,String name2){
		for(int i = 0;i<count;i++){
			if(name1.equals(stus[i])){
				flag =true;	
				stus[i] = name2;
				System.out.println("*****修改结果*****");
				System.out.println("找到并修改成功！");
				break;
			}
		}
		if(!flag){
			System.out.println("*****修改结果*****");
			System.out.println("查无此人，修改失败");
		}
	}
}
