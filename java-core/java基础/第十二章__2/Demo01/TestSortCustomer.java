package chapter12_2;

import java.util.Scanner;

public class TestSortCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] cust = new String[3];
		for (int i = 0; i < cust.length; i++) {
			System.out.print("请输入第"+(i+1)+"个顾客的名字：");
			cust[i] = input.next();
		}
		SortCustomer sct = new SortCustomer();
		sct.sort(cust);
		System.out.print("排序后为：");
		for (int i = 0; i < cust.length; i++) {
			System.out.print(cust[i]+"  ");
		}
		
	}

}
