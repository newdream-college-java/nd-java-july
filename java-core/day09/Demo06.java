import java.util.Arrays;

/*1.7��������һ������Ϊ 5 ������ int [] array = new int[]{1,3,-1,5,-2}�ִ���
 һ �������� newArray[]��Ҫ����������Ԫ�صĴ��˳����ԭ�����Ԫ�����򣬲�
 �����ԭ���� ��Ԫ��ֵС�� 0�����������а� 0 �洢������������������*/
public class Demo06 {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, -1, 5, -2 };
		int[] newArray = new int[array.length];

		// Arrays.toString(newArray);
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			newArray[array.length - 1 - i] = array[i];
			if (newArray[array.length - 1 - i] < 0) {
				newArray[array.length - 1 - i] = 0;
			}
		}
		System.out.print(Arrays.toString(newArray));
	}
}
