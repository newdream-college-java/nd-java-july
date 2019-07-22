/*1.5、假设当前时间是 2015 年 5 月 12 日 10 点 11 分 00 秒，
编写一个 CurrentTime类，设置属性为该 时间，定义 show()方法显示该时间*/
package Demo06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy年MM月dd日 HH点mm分ss秒");// 可以方便地修改日期格式
	String time= dateFormat.format(now);
	public void show(){
		System.out.println(time);
	}
}
