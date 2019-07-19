import java.util.Scanner;
public class hw5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入学生人数:");
		int num=sc.nextInt();
		double sum=0;
		int max=0;
		int min=1000;
		for(int i=1;i<=num;i++){
			System.out.print("请输入第"+i+"个学生的成绩：");
			int score=sc.nextInt();
			sum+=score;
			if(max<=score){
				max=score;
			}
			if(min>score){
				min=score;
			}
		}
		System.out.println("最高分为"+max+"\t最低分为"+min);
		System.out.print("平均分为"+sum/num);
	}
}