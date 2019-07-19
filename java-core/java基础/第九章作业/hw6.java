import java.util.Scanner;
public class hw6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=10;i++){
			System.out.print("请输入第"+i+"个整数：");
			int a=sc.nextInt();
			if(a>0&&a<4){
				count++;
			}
		}
		System.out.print("整数个数为"+count+"\t非法数字个数为"+(10-count));
	}
}