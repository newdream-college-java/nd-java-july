package 第十三章作业1;

import java.util.Scanner;

/*
 1.5、根据指定不同的行和字符，生成不同的三角形
 */
public class Triangle {

	public void printTriangle(int row,String ch) {
		for (int i = 1; i <= row; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入行高：");
		int row=input.nextInt();
		System.out.print("打印的字符：");
		String ch=input.next();
		Triangle triangle=new Triangle();
		triangle.printTriangle(row, ch);
	}

}
