package work;

/**
 * 1.5、根据指定不同的行和字符，生成不同的三角形
 */

public class Triangle {
	public void printTriangle(int row, String ch) {
		for (int i = 1; i <=row; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.printTriangle(6, "%");
	}

}
