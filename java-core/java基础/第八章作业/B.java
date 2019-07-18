/*
	循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,
	要求使用continue 语句完成
 */
import java.util.Scanner;

public  class  B{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			int count=0;
			for(int i=1;i<=5;i++){
				System.out.print("输入第"+i+"名学生的成绩：");
				int a=input.nextInt();
				if(a<80){
					continue;
				}
				count++;
			}
			System.out.println("总共有"+count+"学生的成绩大于80分");
	}
}