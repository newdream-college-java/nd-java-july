package work;

import java.util.Scanner;

/**
 * ����չ--ѡ���� 1. ���������ε������߳����ж�����ֱ�ǡ��۽ǣ�������������Ρ���Ҫ ��������:1)�����������������ߵı߳�
 * 2)�ж��Ƿ񹹳������Σ��Ƿ񹹳������ǡ����� �� ��֮�ʹ��ڵ����ߡ�������������ʾ���� 3)���ܹ��ɣ��ж������ε�����һ�ߵ�ƽ���� ��
 * �������ߵ�ƽ���ĺͣ���Ϊֱ��������;������һ�ߵ�ƽ��������������ƽ���ĺͣ���Ϊ �� ��������;����Ϊ��������Ρ�
 */

public class Triangle8 {
	public void input() {
		int[] a = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.print("�������" + (i + 1) + "���ߣ�");
				a[i] = scanner.nextInt();
			}
			judge(a);
			System.out.println("������(y/n)");
			String s = scanner.next();
			if(s.equals("n")){
				System.out.println("����");
			}
			while(!s.equals("y")){
				System.out.println("�������,���������룡");
				s = scanner.next();
			}
		
		}
	}

	public void judge(int[] arr) {
		if (arr[0] + arr[1] <= arr[2] || arr[1] + arr[2] <= arr[0]
				|| arr[0] + arr[2] <= arr[1]) {
			System.out.println("�����������Σ���");
		} else if (arr[0] * arr[0] == arr[1] * arr[1] + arr[2] * arr[2]
				|| arr[1] * arr[1] == arr[1] * arr[1] + arr[0] * arr[0]
				|| arr[2] * arr[2] == arr[1] * arr[1] + arr[0] * arr[0]) {
			System.out.println("��ֱ�������Σ���");
		} else if (arr[0] * arr[0] > arr[1] * arr[1] + arr[2] * arr[2]
				|| arr[1] * arr[1] > arr[0] * arr[0] + arr[2] * arr[2]
				|| arr[2] * arr[2] > arr[1] * arr[1] + arr[0] * arr[0]) {
			System.out.println("�Ƕ۽������Σ���");
		} else {
			System.out.println("����������Σ���");
		}

	}

	public static void main(String[] args) {
		Triangle8 triangle = new Triangle8();
		triangle.input();
	}
}
