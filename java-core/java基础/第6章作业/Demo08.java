/*循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue
语句完成。*/
import java.util.*;
public class Demo08{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"位同学的成绩：");
			double a=input.nextDouble();
			if(a>80){
				count++;
				continue;
			}
		}
		System.out.println("成绩大于80分的有"+count+"个同学");
	}
}