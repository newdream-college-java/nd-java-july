package chapter13;

/*
	写一个的电池类，类中有属性：品牌，功率，型号。
	类中有方法：
	（一）无返回，无参数的方法：
	电池充电的方法，要求输出“某某品牌的电池正在充电”。
	电池放电的方法，要求输出“某某品牌的电池正在放电”。”。
 	（二）有返回，无参数的方法：
	得到电池的品牌方法，要求返回当前电池的品牌。
	得到电池的功率的方法，要求返回当前电池的功率。
	得到电池的型号的方法，要求返回当前电池的型号。
	返回当前对象信息的方法，即 toString()方法。
 	（三）无返回，有参数的方法：
	设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。
	设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
	设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。
*/

public class Battery {
	String 品牌;
	String 功率;
	String 型号;

	//（一）无返回，无参数的方法：
	//电池充电的方法，要求输出“某某品牌的电池正在充电”。
	public void charge() {
		System.out.println("某某品牌的电池正在充电");
	}
	//电池放电的方法，要求输出“某某品牌的电池正在放电”。”。
	public void nocharge() {
		System.out.println("某某品牌的电池正在放电");
	}
	//（二）有返回，无参数的方法：
	//得到电池的品牌方法，要求返回当前电池的品牌。
	public String brand() {
		return 品牌;
	}
	//得到电池的功率的方法，要求返回当前电池的功率。
	public String power() {
		return 功率;
	}
	//得到电池的型号的方法，要求返回当前电池的型号。
	public String model() {
		return 型号;
	}
	//返回当前对象信息的方法，即 toString()方法。
	public String toString() {
		return "Battery [功率=" + 功率 + ", 品牌=" + 品牌 + ", 型号=" + 型号 + "]";
	}
	//（三）无返回，有参数的方法：
	//设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。
	public void Newbrand(String brand) {
		品牌=brand;
	}
	//设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
	public void Newpawer(String pawer) {
		功率=pawer;
	}
	//设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。
	public void Newmodel(String model) {
		型号=model;
	}
}
