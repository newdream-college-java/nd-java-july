package nine;

import java.util.Scanner;

public class Work8 {

	/**
	 *	1.8、有一组英文歌曲，按照字母顺序从“A”到“Z”排列，保存在一个数组中。现
	 *	在要增加一首歌曲插入数组，并保持歌曲名称升序排列。
	 *  提示：可以使用字符串的 compareToIgnoreCase()方法。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] eng = {"Islan","Ocean","Pretty","Sun",""};
		System.out.print("请输入歌曲名：");
		String string = scanner.next();
		//先找到插入的位置
		int index = 0;//假设在第0个下标
		for (int i = 0; i < eng.length; i++) {
			if (string.compareToIgnoreCase(eng[i])<=0) {
				index = i;
				System.out.println("下标"+index);
				break;
			}
		}
		for (int i = eng.length-1; i > index; i--) {
			eng[i]=eng[i-1];
		}
		eng[index]=string;
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i]+"\t");
		}
	}

}
