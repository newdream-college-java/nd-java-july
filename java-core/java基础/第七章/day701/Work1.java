/*1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����*/

import java.util.Scanner;
public class Work1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		int a;
		while(true){
			System.out.print("������һ��10���ڵĸ�������:");
			a = sc.nextInt();
			if(a>10 || a<1){
				System.out.println("������󣡣�����������\n");
				continue;
			}
			break;
		}
		for(int i = 1;i<=a;i++){
			sum = sum*i;
		}
		System.out.println(a+"�Ľ׳�Ϊ��"+sum);
	}
}
