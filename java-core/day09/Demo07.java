import java.util.Arrays;
import java.util.Scanner;

public class Demo07 {

	/**
	 * 1.8����һ��Ӣ�ĸ�����������ĸ˳��ӡ�A������Z�����У�������һ�������С��� ��Ҫ����һ�׸����������飬�����ָ��������������С�Ч����ͼ:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[24];
		array[0] = "Island";
		array[1] = "Pretty";
		array[2] = "Sun";
		Scanner input = new Scanner(System.in);
		String str = input.next();
		for (int i = 0; i < array.length; i++) {
			if (array[i].compareToIgnoreCase(str) > 0) {

				array[i + 1] = array[i];
				array[i] = str;
				break;
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
