package chapter_13_1;
/*1.5、根据指定不同的行和字符，生成不同的三角形，如图:	*/
import java.util.Scanner;

public class Print {
	public void  printTriangle(int row,String ch){
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Print p=new Print();
		System.out.print("请输入行高：");
		int rowz=sc.nextInt();
		System.out.print("请输入打印的字符：");
		String chz=sc.next();
		p.printTriangle(rowz, chz);
	}

}
