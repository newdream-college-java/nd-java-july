/*1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue 语句完成。*/
import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 1;i<= 5;i++){
			System.out.print("请输入第"+i+"个成绩：");
			int a = sc.nextInt();
			if(a>80){
				count++;
			}else
				continue;
		}
		System.out.println("大于80分的有   "+count+"   个");
	}
}