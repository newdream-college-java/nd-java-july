/*1.4��ʹ����������˼���дһ����������(Calculator),����ʵ�����������ļӡ�
�����ˡ��� ���㡣*/
package chapter_10;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator a=new Calculator();
		System.out.println("��ӭʹ�ü�������");
		a.jisuan();	
	}	
	public void jisuan(){
		int jieguo;
		Scanner input =new Scanner(System.in);
		System.out.print("��������Ҫ����ĵ�һ��������");
		int a=input.nextInt();
		System.out.print("��������Ҫ�����㣺��+ - * /��");
		String jisuan=input.next();
		System.out.print("��������Ҫ����ĵڶ���������");
		int b=input.nextInt();
		if(jisuan.equals("+")){
			jieguo=a+b;
		}else if(jisuan.equals("-")){
			jieguo=a-b;
		}else if(jisuan.equals("*")){
			jieguo=a*b;
		}else{
			jieguo=a/b;
		}
		System.out.println(a+jisuan+b+"="+jieguo);
	}
}
