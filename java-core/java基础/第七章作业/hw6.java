import java.util.Scanner;
public class hw6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个整数");
		int n=sc.nextInt();
		int a=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				a++;
			}
		}
		System.out.print("1到"+n+"中有"+(n-a)+"个奇数和"+a+"个偶数");
	}
}
				