/*
1.2、 循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用
continue 语句完成
*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		int count = 0;
		for(int i=1;i<=5;i++){
			Scanner input= new Scanner(System.in);
			System.out.print("请输入成绩:");
			if(input.hasNextInt()){
				int score = input.nextInt();
				if(score<80){
					continue;
				}
				count++;
			}else{	
				i--;
				System.out.println("输入不合法");
			}
		}
		System.out.print("有"+count+"人成绩大于80");
	}
}