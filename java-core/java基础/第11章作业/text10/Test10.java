package proJob11.text10;
/*
  ��дһ�������� n!(n �Ľ׳�)���õݹ鷽��ʵ�� ��ʾ:�ݹ鷽��ֱָ�ӻ���
�ص�������ķ�����n �Ľ׳˵ݹ�ɱ�ʾ
 */
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("����������Ľ׳ˣ�");
		int n=input.nextInt();
		System.out.println(n+"�Ľ׳�Ϊ��"+jiechen(n));
	}
	
	public static int jiechen(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*jiechen(n-1);
		}
	}
}
