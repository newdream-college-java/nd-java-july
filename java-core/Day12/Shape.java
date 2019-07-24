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
		System.out.print("请输入行高:");
		int row = input.nextInt();
		System.out.print("其输入打印的字符:");
		String ch = input.next();
		Shape shape = new Shape();
		shape.prdintTriangle(row, ch);
	}
}
