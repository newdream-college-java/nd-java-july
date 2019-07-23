package job01.text1;

import java.util.Scanner;

public class CustomerBiz {
	public void addCus(String[] arr) {
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入客户的姓名：");
			String name=input.next();
			System.out.print("继续输入吗？(y/n)");
			char ans=input.next().charAt(0);
			arr[i]=name;
			if(ans=='y') {
				continue;
			}else {
				System.out.println("****************************");
				break;
			}
		}
	}

	public void show(String[] arr) {
		addCus(arr);
		System.out.println("\t客户姓名列表：");
		System.out.println("****************************");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==null) {
				System.out.print("\t");
				continue;
			}
			System.out.print(arr[i]+"\t");
		}

	}
}
