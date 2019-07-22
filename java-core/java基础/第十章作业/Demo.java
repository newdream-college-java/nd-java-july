package Chapter10_类与对象;

/*
	改进上一题，将当前时间改为 2015 年 5 月 12 日 10 点 11 分 30 秒。编写一个
	Demo 类，改变 CurrentTime 类中设定的时间，并打印输出
*/

public class Demo {

	public static void main(String[] args) {
		CurrentTime currentTime=new CurrentTime();
		currentTime.时间=" 2015 年 5 月 12 日 10 点 11 分 30 秒";
		currentTime.show();

	}

}
