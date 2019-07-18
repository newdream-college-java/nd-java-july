package nine;

import java.util.Scanner;

public class Work6 {

	/**
	 * 1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
	 *	编程统计每个 整数和非法数字的个数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,3};
		int [] b = new int[10];
		int hf = 0;		//合法字符个数
		int ff = 0;		//非法字符个数
		for (int i = 0; i < b.length; i++) {
			System.out.print("请输入第"+(i+1)+"个整数:");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < b.length; i++) {
			int left = 0;
			int right = a.length-1;
			while (left<=right) {
				int middle = (left+right)/2;
				if(b[i]>a[middle]){
					left = middle+1;
				}else if (b[i]<a[middle]) {
					right = middle-1;
				}else {
					hf++;
					break;
				}
			}
			if(left>right){
				ff++;
			}
		}
		System.out.print("合法的有"+hf+"个\t非法的有"+ff+"个");
	}
}
