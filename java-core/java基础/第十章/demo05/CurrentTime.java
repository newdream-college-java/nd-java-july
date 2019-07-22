package Jul22;
/*
 * 1.5、假设当前时间是 2015 年 5 月 12 日 10 点 11 分 00 秒，编写一个 CurrentTime
类，设置属性为该 时间，定义 show()方法显示该时间*/
public class CurrentTime {
	int year = 2015;
	int month = 5;
	int day = 12;
	int hour = 10;
	int minute = 11;
	int second = 00;
	
	public void show(){
		System.out.println("当前时间为："+year+"年"+month+"月"+day+"日"+hour+"点"+minute+"分"+second+"秒");
	}
}
