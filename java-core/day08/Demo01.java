import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		/*1.1、 使用 for 循环与 break 语句实现：从 1 一直加到 100,但如果累加的和大于 500
也要结束循环，并输出此时已经加到的数是什么？*/
		int i=1;
		int sum=0;
		for(;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("已经加到了"+i);
		/*1.2、 循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用
		continue 语句完成。*/
		Scanner input=new Scanner(System.in);
		double results;
		int cn=0;
		for(int j=1;j<=5;j++){
			System.out.print("请输入第"+i+"名学士成绩");
			results=input.nextDouble();
			if(results>80){
				cn++;
				continue;
			}
		}
		System.out.println("大于80分的有"+cn+"个");
	}
}