/*1.6、写一个的电池类，类中有属性：品牌，功率，型号。
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
package demo07;

public class Battery {
	String brand="华为";
	int power=3000;
	String model="v2";
	//（一）无返回，无参数的方法：
	//电池充电的方法
	public void charging(){
		System.out.println("某某品牌的电池正在充电");
	}
	//电池放电的方法
	public void discharge(){
		System.out.println("某某品牌的电池正在放电");
	}
	//（二）有返回，无参数的方法：
	//得到电池的品牌方法
	public String getbrand(){
		return brand;
	}
	//得到电池的功率的方法
	public int getpower(){
		return power;
	}
	//得到电池的型号的方法
	public String getmodel(){
		return model;
	}
	//（三）无返回，有参数的方法：
	//修改当前品牌
	public void xgbrand(String xbrand){
		brand=xbrand;
	}
	//修改当前功率
	public void xgpower(int xpower){
		power=xpower;
	}
	//修改当前型号
	public void xgmodel(String xmodel){
		model=xmodel;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", model=" + model + ", power="
				+ power + "]";
	}
	
}
