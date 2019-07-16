import java.util.*;
public class G{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("输入数字：");
		int a = input.nextInt();
		int sum=0;
		while(a>0){
		sum+=a;
		a=input.nextInt();
		if(a==0){
			System.out.println("结束程序！");
		break;
		}
	}
		
		System.out.println("累加的和为"+sum);
}
}