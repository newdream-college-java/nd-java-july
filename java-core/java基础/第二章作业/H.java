/*(��ս��)����һ��С����Ȼ��������������ݺ�С������,��ʽ���� 
    С��       ��������    С������ 
    3.14       3                0.14 */

import java.util.Scanner;

public class H{
	public static void main(String []  args){
	System.out.println("С��\t��������\tС������");
	Scanner input=new Scanner(System.in);
	double n=input.nextDouble();	
	double x=n%1;
	double y=n-x;
	System.out.print(n+"\t"+y+"\t\t"+x);
	} 
}