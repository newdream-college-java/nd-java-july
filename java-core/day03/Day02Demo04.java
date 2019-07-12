import java.util.Scanner;
public class Day02Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//6、输入一个 int 型的数据，判断这个数是 否能被 2 整除，如果能被 2 整除，
		//那么输出“这个数是偶数”，否则输出“这个数是奇数”。提示:8%2==0 10%2==0 9%2=1
		System.out.println("请输入一个int类型的整数：");
		int data=input.nextInt();
		if(data%2==0){
			System.out.println("这是一个整数");
		}else{
			System.out.println("这是一个奇数");
		}
		
	}
}