package work;

/**
 * 1.5������ָ����ͬ���к��ַ������ɲ�ͬ��������
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
