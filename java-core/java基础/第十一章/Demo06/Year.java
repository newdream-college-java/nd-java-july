package chapter11;

public class Year {
	public void judge(int year){
		if((year%4 == 0 &&year%100!=0)||year%400==0){
			System.out.println("亲，这是闰年呢！");
		}
		else{
			System.out.println("亲，这不是闰年哦！");
		}
	}
}
