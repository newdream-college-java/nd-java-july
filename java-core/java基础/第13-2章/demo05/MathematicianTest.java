package demo05;

import java.util.Scanner;

public class MathematicianTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Mathematician mt=new Mathematician();
		System.out.println("1.�����");
		System.out.println("2.�������ֵ");
		System.out.print("������Ҫ����ķ�����1/2��:");
		int xz=input.nextInt();
		if(xz==1){
			System.out.print("������Ҫ��������ֵĸ�����");
			int b=input.nextInt();
			int a[]=new int [b];
			for (int i = 0; i < a.length; i++) {
				System.out.print("������Ҫ����ĵ�"+(i+1)+"����:");
				a[i]=input.nextInt();
			}
			mt.add(a);
			System.out.println("��Ϊ��"+mt.add(a));
		}else{
				System.out.print("������Ҫ��������ֵĸ�����");
				int b=input.nextInt();
				int a[]=new int [b];
				for (int i = 0; i < a.length; i++) {
					System.out.print("������Ҫ����ĵ�"+(i+1)+"����:");
					a[i]=input.nextInt();
				}
				System.out.println("���ֵΪ��"+mt.max(a));
		}
	}
}
