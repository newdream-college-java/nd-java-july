/*循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用
continue 语句完成。*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"位同学的成绩：");
			double score=input.nextDouble();
			if(score<80){
				continue;
			}
			count++;
		}
		System.out.println("成绩大于80分的人数位："+count);
	}
}