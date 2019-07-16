/*
练习4：输入2个整数，求这两个数的最小公倍数和最大公约数？
最小公倍数范围：两数最大值<=最小公倍数<=两数之积
最大公约数范围：1<=最大公约数<=两数最小值
		最小公倍数  		最大公约数
2	3	  6					1
2	4	  4  				2
4	6	  12				2
6   9     18				3

	     9？
	     10？
	     11？
	     12？
	     13？
	     14？
	     15？
	     16？
	     17？
	     18

		
*/
import java.util.*;
public class Demo05{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.println("请输入2个整数：");
		int a = input.nextInt();
		int b = input.nextInt();
		//最小公倍数？ 最小公倍数%a==0&&最小公倍数%b==0
		int max = a>b?a:b;
		for(int i=max;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				System.out.println(a+","+b+"的最小公倍数为："+i);
				break;//中止
			}
		} 
		int min = a<b?a:b;
		for(int i=min;i>=1;i--){
			if(a%i==0&&b%i==0){
				System.out.println(a+","+b+"的最大公约数为："+i);
				break;//中止循环
			}
		}
	}
}



