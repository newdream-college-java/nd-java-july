import java.util.Scanner;
public class B{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		int a=0;
		for(int i =1;i<=5;i++){
			System.out.println("请输入第"+i+"名同学的成绩：");
			int cj = input.nextInt();
		if(cj<80){
		continue;
		}
		a++;
		}
		System.out.println("成绩大于80分的人数为："+a);
}
}
		