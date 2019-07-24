package job02.text3;

import java.util.Scanner;

public class TextShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ShuZu shu=new ShuZu();
		System.out.print("请输入数组长度：");
		int n=scanner.nextInt();
		int []arr=new int[n];
		System.out.println("请输入数组的数据");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"个数：");
			arr[i]=scanner.nextInt();
		}
		System.out.print("请输入要插入进数组的下标号：");
		int index=scanner.nextInt();
		System.out.print("请输入要插入的数据：");
		int value=scanner.nextInt();
		System.out.println("插入数据之前的数组为：");
		shu.show(arr);
		System.out.println("插入数据之后的数组为：");
		shu.insertArray(arr, index, value);
		shu.show(arr);
	}

}
