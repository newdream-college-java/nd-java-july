import java.util.Scanner;
public class H{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int rs=0;
		for(int i=1;i<=5;i++){
		System.out.println("请输入第"+i+"名学生的成绩：");
		int cj = input.nextInt();
		if(cj<80){
		continue;
		}
		rs++;
	}
		System.out.println("成绩大于80分的有"+rs+"人");
}
}