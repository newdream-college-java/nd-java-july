/*练习1，输入一个整数，如果是偶数，就是这个数是偶数，
如果是奇数就输出这个数是奇数。

练习2，输入球星的性别 如果是女，就是球星是娘们，
如果是男 就输出球星是爷们！。
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//提示
		System.out.print("请输入一个整数：");
		int number = input.nextInt();
		if(number%2==0){//是否为偶数
			System.out.println(number+"是偶数！");
		}
		if(number%2==1){//是否为奇数
			System.out.println(number+"是奇数！");
		}

		//if-else版本
		if(number%2==0){
			System.out.println(number+"是偶数！");
		}else{
			System.out.println(number+"是奇数！");
		}

	}
}