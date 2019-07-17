/*6、输入一个int型的数据，判断这个数是否能被2整除，如果能被2整除，那么输出“这个数是偶数”，否则输出“这个数是奇数”。提示:8%2==0 10%2==0*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n=in.nextInt();
		if(n%2==0){
		System.out.println("该数是偶数！");
		}else System.out.println("该数是奇数！！");
			
	}
}