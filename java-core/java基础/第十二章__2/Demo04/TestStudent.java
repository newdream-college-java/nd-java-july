package chapter12_2;

public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBiz sbz = new StudentBiz();
		Student stu = new Student();
		stu.C = 85;
		stu.Java = 90;
		stu.SQL = 88;
		System.out.println("平均分为："+sbz.getAvg(stu));
	}

}
