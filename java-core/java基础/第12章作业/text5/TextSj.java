package job01.text5;

import java.util.Scanner;
//根据指定不同的行和字符，生成不同的三角形，如图:	
public class TextSj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		SanJiao san=new SanJiao();
		System.out.print("请输入行高：");
		int n=scanner.nextInt();
		System.out.print("请输入打印的字符：");
		char zf=scanner.next().charAt(0);
		san.show(n, zf);
	}

}
