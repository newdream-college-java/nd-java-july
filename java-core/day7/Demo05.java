import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		/*1.6、输入一个整数 n统计 1 到 n 中有多少个奇数和偶数*/
		Scanner input=new Scanner(System.in);
		int data=input.nextInt();
		int even=0,odd=0;
		for(int i=1;i<=data;i++){
			if(i%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("奇数有:"+odd+"\t偶数有："+even);
	}
}