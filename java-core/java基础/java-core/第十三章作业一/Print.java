package chapter_13_1;
/*1.5������ָ����ͬ���к��ַ������ɲ�ͬ�������Σ���ͼ:	*/
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
		System.out.print("�������иߣ�");
		int rowz=sc.nextInt();
		System.out.print("�������ӡ���ַ���");
		String chz=sc.next();
		p.printTriangle(rowz, chz);
	}

}
