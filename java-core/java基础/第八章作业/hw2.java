import java.util.Scanner;
public class hw2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a=0;
			for(int j=1;j<=5;j++){
				System.out.print("请输入第"+j+"个同学的成绩:");
				int score=input.nextInt();
				if(score<=80){
					continue;
				}
				a++;
			}
		System.out.println("分数大于80分以上的有"+a+"人");
	}
}