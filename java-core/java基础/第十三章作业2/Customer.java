package ��ʮ������ҵ2;

import java.util.Arrays;
import java.util.Scanner;

/*1.1������˵��
��д������ʵ�ֶԿͻ�����������*/
public class Customer {
	public void sortName(String[] name) {
		Arrays.sort(name);
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		//Scanner input=new Scanner(System.in);
		Customer cs=new Customer();
		String[] s={"lili","bob","aliss","tom","jim"};
		cs.sortName(s);
	}
}
