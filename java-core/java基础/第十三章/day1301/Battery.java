package work;

/**
 * 1.6、写一个的电池类，类中有属性：品牌，功率，型号。
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
	String brand = "小米" ;
	String power = "30W";
	String type = "ABC型号";
	public void eIn() {
		System.out.println(brand+"品牌的电池正在充电");
	}
	public void eOut() {
		System.out.println(brand+"品牌的电池正在放电");
	}
	
	public String getBrand() {
		return brand;
	}
	public String getPower() {
		return power;
	}
	public String getType() {
		return type;
	}
	public void setBrand(String s) {
		brand = s;
	}
	public void setPower(String s) {
		power = s;
	}
	public void setType(String s) {
		type = s;
	}
	
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.eIn();
		battery.eOut();
		battery.setBrand("华为");
		battery.setPower("100W");
		battery.setType("DEF型");
		System.out.println(battery.getBrand());
		System.out.println(battery.getPower());
		System.out.println(battery.getType());
		
	}

}
