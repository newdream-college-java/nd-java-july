package Work;
/**
 * 1.6�����һ���ж�ĳ���Ƿ�����ķ�����Ȼ���� main �����е��ã�������
 */
public class LeapYear {

	public void runnain(int year) {
		if (year%100!=0&&year%4==0||year%400==0) {
			System.out.println(year+"�������꣡");
		}else {
			System.out.println(year+"�겻�����꣡");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeapYear leapYear = new LeapYear();
		leapYear.runnain(2004);
	}

}
