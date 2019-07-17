/*
1.6、输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();
		int j = 0;
		int o = 0;
		for(int i = 1;i<=num;i++){
			if(i%2 == 0){
				o++;
			}
			else{
				j++;
			}
		}
		System.out.println("1到"+num+"中有"+j+"个奇数，"+o+"个偶数。");
	}
}