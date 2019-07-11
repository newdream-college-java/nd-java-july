/*输入的成绩，如果成绩<60 输出不及格
如果80>成绩>=60 输出不及格及格
如果90>成绩>=80 输出不及格良
如果成绩>=90 输出优秀


int 整数：
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a= 2147483647;
		System.out.println(a+1);


		//提示
		System.out.println("请输入一个成绩：");
		double score = input.nextDouble();
		if(score<60){
			System.out.println("不及格");
		}else if(score>=60&&score<80){
			System.out.println("及格");
		}else if(score>=80&&score<90){
			System.out.println("良");
		}else{
			System.out.println("优秀");
		}



	}
}