package demo05;

import java.util.Scanner;

public class MathematicianTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Mathematician mt=new Mathematician();
		System.out.println("1.计算和");
		System.out.println("2.计算最大值");
		System.out.print("请输入要计算的方法（1/2）:");
		int xz=input.nextInt();
		if(xz==1){
			System.out.print("请输入要计算的数字的个数：");
			int b=input.nextInt();
			int a[]=new int [b];
			for (int i = 0; i < a.length; i++) {
				System.out.print("请输入要计算的第"+(i+1)+"个数:");
				a[i]=input.nextInt();
			}
			mt.add(a);
			System.out.println("和为："+mt.add(a));
		}else{
				System.out.print("请输入要计算的数字的个数：");
				int b=input.nextInt();
				int a[]=new int [b];
				for (int i = 0; i < a.length; i++) {
					System.out.print("请输入要计算的第"+(i+1)+"个数:");
					a[i]=input.nextInt();
				}
				System.out.println("最大值为："+mt.max(a));
		}
	}
}
