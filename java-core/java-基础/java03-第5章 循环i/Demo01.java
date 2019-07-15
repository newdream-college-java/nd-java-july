import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a= 2147483647;
		System.out.println(a+1);


		//提示
		System.out.println("请输入一个成绩：");
		int score = input.nextInt();
		/*if(score<60){
			System.out.println("不及格");
		}else if(score>=60&&score<80){
			System.out.println("及格");
		}else if(score>=80&&score<90){
			System.out.println("良");
		}else{
			System.out.println("优秀");
		}*/
		switch(score/10){
			case 10://score>=90
				
			case 9://score>=90
				System.out.println("优秀");
				break;
			case 8://score>=80&&score<90
				System.out.println("良");
				break;
			case 7://score>=60&&score<80
				
			case 6: //score>=60&&score<80
				System.out.println("及格");
				break;
			default://score<60     else
				System.out.println("不及格");
				break;
		}
	}
}