import java.util.Scanner;

public class Demo05 {
	/*
	 * 1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡� ���ͳ��ÿ�� �����ͷǷ����ֵĸ�����
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�Ӽ��������� 10 ������,�Ϸ�ֵΪ 1��2��3");
		int[] arr = new int[10];
		int yesunt = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int data = input.nextInt();
			arr[i] = data;
			if (data == 2 || data == 1 || data == 3) {
				yesunt++;
			} else {
				sum++;
			}
		}
		System.out.println("\t������" + yesunt + "��\t�Ƿ�������" + sum + "��");
	}
}
