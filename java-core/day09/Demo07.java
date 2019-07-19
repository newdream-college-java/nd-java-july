import java.util.Arrays;
import java.util.Scanner;

public class Demo07 {

	/**
	 * 1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现 在要增加一首歌曲插入数组，并保持歌曲名称升序排列。效果如图:
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
