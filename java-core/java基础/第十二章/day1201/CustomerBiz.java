package work;

import java.util.Scanner;

/**
 * 1.1、需求说明
	创建客户业务类 CustomerBiz,实现客户姓名的添加和显示，如图
 */
public class CustomerBiz {
	
	public void customer(int a){
		String[] arr = new String[a];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入客户的名字：");
			arr[i] = sc.next();
			//System.out.println("继续输入吗？(y/n)");
			//String a = sc.next();
			//if (a.equals("n")) {
			//	break;
			//}
		}
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
		CustomerBiz customerBiz = new CustomerBiz();
		customerBiz.customer(3);

	}

}
