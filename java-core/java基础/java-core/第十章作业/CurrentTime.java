/*1.5、假设当前时间是 2015 年 5 月 12 日 10 点 11 分 00 秒，编写一个 CurrentTime
类，设置属性为该 时间，定义 show()方法显示该时间*/
package chapter_10;

public class CurrentTime {
	String time;
	public void show(){
		System.out.println("当前时间为："+time);
	}
	public static void main(String[] args) {
		CurrentTime a=new CurrentTime();
		a.time="2015 年 5 月 12 日 10 点 11 分 00 秒";
		a.show();
	}

}
