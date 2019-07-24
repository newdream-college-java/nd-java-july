package job02.text5;

import java.util.Scanner;

public class TextAri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Arimetic ari=new Arimetic();
		System.out.print("请输入数组长度：");
		int n=input.nextInt();
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"个元素：");
			arr[i]=input.nextInt();
		}
		
		System.out.println("数组和为："+ari.sumNum(arr));
		System.out.println("数组最大值为："+ari.maxNum(arr));
	}

}
