/*
 从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
 编程统计每个 整数和非法数字的个数。
 */
import java.util.*;
public class Demo06{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入：");
			a[i] = input.nextInt();
			if (a[i] != 1 && a[i] != 2 && a[i] != 3) {
				count1++;
			}else if(a[i]==1){
				count2++;
			}else if(a[i]==2){
				count3++;
			}else if(a[i]==3){
				count4++;
			}else{
				System.out.println("输入错误");
			}
		}
		System.out.println("非法数字有：" + count1 + "个");
		System.out.println("数字1有：" + count2 + "个");
		System.out.println("数字2有：" + count3 + "个");
		System.out.println("数字3有：" + count4 + "个");
	}
}