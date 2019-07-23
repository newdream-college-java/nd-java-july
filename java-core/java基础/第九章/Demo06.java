/*
1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
编程统计每个 整数和非法数字的个数
*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			System.out.print("请输入第"+(i+1)+"个数：");
			arr[i] = input.nextInt();
			if(arr[i] == 1||arr[i] == 2||arr[i] == 3){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("整数有"+a+"个，"+"非法数字有"+b+"个。");
	}
}