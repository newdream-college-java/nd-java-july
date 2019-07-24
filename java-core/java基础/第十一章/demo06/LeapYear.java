/*1.6、设计一个判断某年是否闰年的方法，然后在 main 方法中调用，输出结果*/
package demo06;

public class LeapYear {
	public boolean leapYear(int year){
		boolean result=false;
		if(year%4==0&&year%100!=0||year%400==0){
			result=true;
		}
		return result;
	}
}
