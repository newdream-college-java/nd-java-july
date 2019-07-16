/*1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue 语句完成。*/
import java.util.*;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.println("第"+i+"位同学的成绩为：");
			int a=input.nextInt();
			if(a<=80){
				continue;
			}
			count++;
		}
		System.out.println("成绩大于80分的有"+count+"人");
	}
}