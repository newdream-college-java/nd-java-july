/*、
	输入一个整数 n,统计 1 到 n 中有多少个奇数和偶数
 */
import java.util.Scanner;

public class F{
	public static void main(String[ ] args){
		Scanner input=new Scanner(System.in);
		int countj=0,counto=0;
		int a=input.nextInt();
		for(int i=a;0<i;i--){
			if(i%2==0){
				counto++;
			}else{
				countj++;
			}
		}
		System.out.println("1 到"+a+"中有"+countj+"个奇数和"+counto+"个偶数");
	}
}