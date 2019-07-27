package chapter12_2;
/*
 * 1.6、写一个的电池类，类中有属性：品牌，功率，型号。
类中有方法：
第 1 阶段– Java 第十三章—带参方法(2)
新梦想 ◆ IT 学院
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
 * */
public class Battery {
	String brand;
	String power;
	String model;
	
	//无返回，无参数的方法：
	//电池充电的方法，要求输出“某某品牌的电池正在充电”。
	//电池放电的方法，要求输出“某某品牌的电池正在放电”。”。
	public void fangdian(){
		System.out.println(brand+"的电池正在放电");
	}
	public void chongdian(){
		System.out.println(brand+"的电池正在充电");
	}
	/*
	 * （二）有返回，无参数的方法：
得到电池的品牌方法，要求返回当前电池的品牌。
得到电池的功率的方法，要求返回当前电池的功率。
得到电池的型号的方法，要求返回当前电池的型号。
返回当前对象信息的方法，即 toString()方法。
	 * */
	public String getBrand(){
		return brand;
	}
	public String getPower(){
		return power;
	}
	public String getModel(){
		return model;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", model=" + model + ", power="
				+ power + "]";
	}
	/*
	 * （三）无返回，有参数的方法：
设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。
设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。
	 * */
	public void setBrand(String brand1){
		brand = brand1;
	}
	public void setModel(String model1){
		model = model1;
	}
	public void setPower(String power1){
		power = power1;
	}
}

