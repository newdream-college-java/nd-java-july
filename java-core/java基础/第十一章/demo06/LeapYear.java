/*1.6�����һ���ж�ĳ���Ƿ�����ķ�����Ȼ���� main �����е��ã�������*/
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
