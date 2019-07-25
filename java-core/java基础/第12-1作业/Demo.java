import java.util.Scanner;


public class Demo {
	public void printTriangle(int row,String ch){
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Demo a=new Demo();
		Scanner sc=new Scanner (System.in);
		System.out.println("请输入行数：");
		int b=sc.nextInt();
		System.out.println("请输入打印的字符");
		String c=sc.next();
		a.printTriangle(b, c);
	}
}
