import java.util.Scanner;

public class Shape {
	public void prdintTriangle(int row, String ch) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������и�:");
		int row = input.nextInt();
		System.out.print("�������ӡ���ַ�:");
		String ch = input.next();
		Shape shape = new Shape();
		shape.prdintTriangle(row, ch);
	}
}
