package demo01;

import java.util.Scanner;

public class NameSortTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		NameSort nameSort=new NameSort();
		System.out.print("���������ֵĸ�����");
		int a=input.nextInt();
		String []names=new String[a];
		for (int i = 0; i < names.length; i++) {
			System.out.print("�������"+(i+1)+"��ѧ��������(Ӣ��)��");
			names[i]=input.next();
		}
		nameSort.sort(names);
	}
}
