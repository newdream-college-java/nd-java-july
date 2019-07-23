package job01.text6;

import java.util.Scanner;

public class TextMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Mathematician math=new Mathematician();
		System.out.print("请输入第一个整数：");
		int a=scanner.nextInt();
		System.out.print("请输入第二个整数：");
		int b=scanner.nextInt();
		System.out.println(a+"和"+b+"中的最大值为："+math.twoInt(a, b));
		System.out.println(a+"的个位数为："+math.geWei(a));
		System.out.println(a+"的立方为："+math.liFang(a));
		System.out.println(a+"的累加结果为："+math.Sum(a));
	}

}
