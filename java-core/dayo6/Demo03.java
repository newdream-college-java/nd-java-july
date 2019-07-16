import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double results=0;
		int statistical=0;
		//1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue语句完成。
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"位同学的成绩\n");
			results=input.nextDouble();
			if(results>80){
				statistical++;
				continue;
			}
		}
		System.out.println("大于80分的有"+statistical);
	}
}