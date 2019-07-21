
/**
 * 1.5、假设当前时间是 2015 年 5 月 12 日 10 点 11 分 00 秒，编写一个 CurrentTime
	类，设置属性为该 时间，定义 show()方法显示该时间
	1.6、改进上一题，将当前时间改为 2015 年 5 月 12 日 10 点 11 分 30 秒。编写一个
	Demo 类，改变 CurrentTime 类中设定的时间，并打印输出
 */
public class Work5 {
	int year = 2015;
	int month = 5;
	int day = 12;
	int hour = 10;
	int minutes = 11;
	int seconds = 00;
	public void show() {
		System.out.println(year+" 年 "+month+" 月 "+day+" 日 "+hour+" 点 "+minutes+" 分 "+seconds+" 秒 ");
	}
	public void changeYear(int a) {
		year = a;
	}
	public void changeSeconds(int s) {
		seconds = s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work5 time = new Work5();
		time.show();
		time.changeSeconds(30);
		time.show();
	}

}
