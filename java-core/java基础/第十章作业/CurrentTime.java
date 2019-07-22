package Chapter10_类与对象;

/*
 假设当前时间是 2015 年 5 月 12 日 10 点 11 分 00 秒，编写一个 CurrentTime
 类，设置属性为该 时间，定义 show()方法显示该时间
 */

public class CurrentTime {
	String 时间 = "2015 年 5 月 12 日 10 点 11 分 00 秒";

	public void show() {
		System.out.println(时间);
	}

	public static void main(String[] args) {
		CurrentTime currentTime = new CurrentTime();
		currentTime.show();
	}

}
