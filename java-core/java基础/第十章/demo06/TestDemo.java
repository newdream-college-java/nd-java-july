package Jul22;
/*
 * 1.6、改进上一题，将当前时间改为 2015 年 5 月 12 日 10 点 11 分 30 秒。编写一个
Demo 类，改变 CurrentTime 类中设定的时间，并打印输出*/
public class TestDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentTime cur = new CurrentTime();
		cur.year = 2015;
		cur.month = 5;
		cur.day = 12;
		cur.hour = 10;
		cur.minute = 11;
		cur.second = 30;
		cur.show();
	}

}
