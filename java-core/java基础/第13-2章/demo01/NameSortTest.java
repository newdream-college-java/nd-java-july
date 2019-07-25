package demo01;

import java.util.Scanner;

public class NameSortTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		NameSort nameSort=new NameSort();
		System.out.print("请输入名字的个数：");
		int a=input.nextInt();
		String []names=new String[a];
		for (int i = 0; i < names.length; i++) {
			System.out.print("请输入第"+(i+1)+"个学生的姓名(英文)：");
			names[i]=input.next();
		}
		nameSort.sort(names);
	}
}
