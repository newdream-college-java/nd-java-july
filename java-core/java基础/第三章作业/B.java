/*����һ����ݣ��������껹��ƽ�� */

import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(year%400==0||year%4==0&&!(year%100==0)){
		System.out.println("�����Ϊ����");
		}else{
		System.out.println("�����Ϊƽ��");
		}
	}
}