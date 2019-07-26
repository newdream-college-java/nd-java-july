package 十三章_2;

import java.util.Scanner;

public class SortName {

	/**
	 * @param args
	 */
	public static void sortName(Customer[] a) {

		for (int i = 1; i < a.length; i++) {
			String temp;
			for (int j = i; j > 0; j--) {
				if (a[j - 1].name.compareTo(a[j].name) > 0) {
					temp = a[j].name;
					a[j].name = a[j - 1].name;
					a[j - 1].name = temp;
				}else{
					break;
				}
			}
		}
		System.out.println("客户姓名的顺序为：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i].name + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入客户数：");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Customer[] test = new Customer[number];
		for (int i = 0; i < test.length; i++) {
			test[i] = new Customer();
		}
		for (int i = 0; i < number; i++) {
			System.out.print("请输入第" + (i + 1) + "位客户姓名：");
			String newname = input.next();
			test[i].name = newname;
		}
		sortName(test);
	}

}
