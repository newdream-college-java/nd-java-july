import java.util.Scanner;
public class Demo03{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入第一个数a：");
		int a=input.nextInt();
		System.out.print("请输入第二个数b：");
		int b=input.nextInt();
		int Max=a>b?a:b;
		int Min=a<b?a:b;
		int iMax=0;
		int iMin=0;
		//求最小公倍数
		for(int i=Max;i<=(a*b);i++){
			if(i%a==0&&i%b==0){
				iMin=i;
				break;
			}
		}      
		//求最大公约数
		for(int i=Min;i>=1;i--){
			if(a%i==0&&b%i==0){
				iMax=i;
				break;
			}
		}
		System.out.println("最小公倍数为："+iMin);
		System.out.println("最大公约数为："+iMax);
	}
}