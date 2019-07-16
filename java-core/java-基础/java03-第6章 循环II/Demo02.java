/*

输入：6
0+6=6
	i + (6-i) =
1+5=6
2+4=6
3+3=6
4+2=6
5+1=6
6+0=6

重复求和：2个加数

输入数字：6
0+1=1
1+3=4
2+5=7
3+7=10
4+9=13
5+11=16
6+13=19


*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//提示
		System.out.print("请输入一个数字：");
		int num = input.nextInt();
		//方式一：变化的部分与循环变量的规律
		//for(int i=0;i<=num;i++){//表示左边的加数
			//System.out.println(i+"+"+(num-i)+"="+num);
		//}
		//方式二： 有几个变化的部分就定义几个变量 2个
		int i = 0;
		int j = num;
		for(;i<=num;i++,j--){
			System.out.println(i+"+"+j+"="+num);
			//j--;
		}

	}
}