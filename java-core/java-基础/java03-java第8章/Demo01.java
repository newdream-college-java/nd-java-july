import java.util.Scanner;
public class Demo01{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int count = 0;//所有班级
		for(int i =1;i<4;i++){//i表示的班级编号
			//int count = 0;//每个班级
			int sum = 0;//每个班级的总分
			//1.输出 输入哪个班的成绩
			System.out.println("请输入第"+i+"班级的成绩：");
			//2.输入4个同学的成绩
			for(int j=1;j<5;j++){//学生的编号
				//提示
				System.out.print("请输入第"+j+"个同学得的成绩：");
				int cj = input.nextInt();
				sum+=cj;
				if(cj<85){
					continue;
				}
				//统计
				count++;
				
			}
			//3.输出该班级的平局分=总分/人数
			System.out.println("第"+i+"个班级的平局分为："+sum/4.0+"\n");

		}
		System.out.println("成绩大于85的人数为："+count);

	}
}