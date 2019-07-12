import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		//2.4、输入三个整数，如果这三个整数都相等，那么输出“这三个数相等”。否则再判断这三个数之和是否大于 1000，
		//如果大于 1000 输出“这三个数之和大于 1000”否则输出“这三个数之和不大于 1000”。(嵌套 if)
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int onedata=input.nextInt();
		int twodata=input.nextInt();
		int threedata=input.nextInt();
		if(onedata==twodata && onedata==threedata){
			System.out.println("这三个数相等");
		}else{ 
			if(onedata+twodata+threedata>1000){
				System.out.println("这三个数之和大与1000");
			}else{
					System.out.println("这三个数之和不大于1000");
			}
		}
	}
}