import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double score;
		int a=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入学生成绩:");
			score = input.nextDouble();
			if(score<=80){
				continue;
			}
			a++;
		}
		System.out.print("80分以上的有"+a+"个");
	}
}