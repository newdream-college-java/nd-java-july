package Work;
/**
 * 1.6、设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果
 */
public class LeapYear {

	public void runnain(int year) {
		if (year%100!=0&&year%4==0||year%400==0) {
			System.out.println(year+"年是闰年！");
		}else {
			System.out.println(year+"年不是闰年！");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear leapYear = new LeapYear();
		leapYear.runnain(2004);
	}

}
