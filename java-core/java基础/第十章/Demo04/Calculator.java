/*1.4��ʹ����������˼���дһ����������(Calculator),����ʵ�����������ļӡ�
�����ˡ��� ���㡣*/
package Demo04;

import java.util.Scanner;

public class Calculator {
	public double calculator(){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ʽ�����ַ����ÿո������a + b����");
		int a=input.nextInt();
		String c=input.next();
		int b=input.nextInt();
		int result=0;
		if(c.equals("+")){
			result=a+b;
		}else if(c.equals("-")){
			result=a-b;
		}else if(c.equals("*")){
			result=a*b;
		}else if(c.equals("/")){
			result=a/b;
		}
		return result;
	}
}
