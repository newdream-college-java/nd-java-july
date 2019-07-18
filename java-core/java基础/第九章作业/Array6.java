import java.util.Scanner;

/*1.6、从键盘上输入 10 个整数，合法值为 1、2、3。不是这 3 个数则为非法数字。
编程统计每个 整数和非法数字的个数。*/

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int count1=0,count2=0;
		for (int i = 0; i < 10; i++) {
			System.out.print("请输入第"+(i+1)+"个数字：");
			int a=input.nextInt();
			if (a==1||a==2||a==3) {
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("合法数字个数："+count1+"\n"+"非法数字个数："+count2+"\n");
	}

}
