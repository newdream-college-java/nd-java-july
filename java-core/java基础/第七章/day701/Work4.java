/*1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int zsCount = 0;
		int fsCount = 0;
		int zCount = 0;
		int a;
		while(true){
			System.out.print("请输入任意整数：");
			a = sc.nextInt();
			if(a==999){	
				break;
			}else if(a>0){
				zsCount++;
			}else if(a<0){
				fsCount++;
			}else
				zCount++;

		}
		System.out.println("正整数有"+zsCount+"个");
		System.out.println("负整数有"+fsCount+"个");						System.out.println("零有"+zCount+"个");
	}
}