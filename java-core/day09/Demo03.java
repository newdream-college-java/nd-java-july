import java.util.Arrays;
import java.util.Scanner;

/**
 * ��һ��������ַ������������� ��������洢ԭ�ַ����� ���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
 * �������е�Ԫ���������
 */
public class Demo03 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.print("�ַ�ԭ����:");
		// ���÷�������
		getTraverse(arr);
		// ���ַ�������������
		Arrays.sort(arr);
		System.out.print("�ַ����������:");
		getTraverse(arr);
		// �������е�Ԫ���������
		System.out.print("�������Ϊ:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		/*
		 * ����һ����ϰ�еõ��������ַ������в���һ���µ��ַ���Ҫ�����֮���ַ����� �Ա� ������ �޸���һ����Ŀ�Ĵ��룬���峤��Ϊ 9
		 * �����飬����ԭ�ַ����� ���� һ�ⷽ��ʵ���ַ����������ҵ������ַ��Ĳ���λ�� �Ӳ���λ�ÿ�ʼ��Ԫ�ؾ��� ��һ��λ��
		 * �����µ��ַ�����������
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ�:");
		// ӦΪ����û��char���������ַ�������
		String Data = input.next();
		// ת��Ϊ�ַ���
		char chardata = Data.charAt(0);
		getCharInsert(arr, chardata);

	}

	// �����ķ���
	public static void getTraverse(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	// �ַ����뷽��
	public static void getCharInsert(char[] arr, char chardata) {
		int index = 0;
		for (; index < arr.length; index++) {
			if (chardata < arr[index]) {
				System.out.println("������±���:" + index);
				break;
			}
		}
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = chardata;
		System.out.print("�������ַ�������:" + Arrays.toString(arr));
	}
}
