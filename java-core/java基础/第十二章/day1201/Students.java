package work;

import java.util.Scanner;


/**
 * 1.3、需求说明
		修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
 */
public class Students {
	public void creatInFo(int a) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入客户的名字：");
			arr[i] = sc.next();
		}
		show(arr);
		
		System.out.print("\n请输入要修改的学生姓名：");
		String c = sc.next();
		System.out.print("请输入新的学生姓名：");
		String b = sc.next();
		changeInfo(c, b, arr);
		
	}
	public void changeInfo(String c,String b,String arr[]) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (c.equals(arr[i])) {
				arr[i]=b;
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("\n对不起，没这个人");
		}else {
			System.out.println("\n找到并修改成功！！");
		}
		
		show(arr);
	}
	public void show(String arr[]) {
		System.out.println("***************************");
		System.out.println("\t客户姓名列表");
		System.out.println("****************************");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=null) {
				System.out.print(arr[i]+"\t");			
			}
		}
	}
	public static void main(String[] args) {
		Students students = new Students();
		students.creatInFo(5);
	}

}
