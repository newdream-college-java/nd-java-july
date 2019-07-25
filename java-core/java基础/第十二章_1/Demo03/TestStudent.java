package chapter12_1;

import java.util.Scanner;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Student stu = new Student();
		stu.add();
		stu.showStus();
		System.out.print("请输入要修改的名字：");
		String name1 = input.next();
		System.out.print("请输入新的名字：");
		String name2 = input.next();
		stu.modify(name1, name2);
		stu.showStus();		
		
	}

}
