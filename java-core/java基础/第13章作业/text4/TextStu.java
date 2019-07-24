package job02.text4;

/*学期期末学员共参加了 3 门课的考试，即 Java、C、SQL，编写方法计算
每位学员 3 门课的平均分*/
import java.util.Scanner;

public class TextStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		StudentBiz stud=new StudentBiz();
		Student stu=new Student();
		System.out.print("请输入学生姓名：");
		stu.name=scanner.next();
		stud.getAvg(stu);
		System.out.print("是否继续？(y/n):");
		char ans=scanner.next().charAt(0);
		while(ans=='y') {
			System.out.print("请输入学生姓名：");
			stu.name=scanner.next();
			stud.getAvg(stu);
			System.out.print("是否继续？(y/n):");
			ans=scanner.next().charAt(0);
		}
		System.out.println("结束！");
	}

}
