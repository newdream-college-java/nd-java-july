/**
 * 写一个的电池类，类中有属性：品牌，功率，型号。
 * @author 54975
 *
 */
public class Battery {
	//品牌
	String name="三星";
	//功率
	String power="2500";
	//型号
	String model="x86";
	/**
	 * 电池充电的方法，要求输出“某某品牌的电池正在充电”。
	 */
	public void getshow(){
		System.out.println(name+"品牌的电池正在充电");
	}
	/**
	 * 电池放电的方法，要求输出“某某品牌的电池正在放电”。”。
	 */
	public void setshow(){
		System.out.println(name+"品牌的电池正在充电");
	}
	/**
	 * 	得到电池的品牌方法，要求返回当前电池的品牌。
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 得到电池的功率的方法，要求返回当前电池的功率。
	 * @return
	 */
	public String getPower() {
		return power;
	}
	/**
	 * 设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
	 * @param power
	 */
	public void setPower(String power) {
		this.power = power;
	}
	/**
	 * 得到电池的型号的方法，要求返回当前电池的型号。
	 * @return
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * 返回当前对象信息的方法，即 toString()方法。
	 */
	public String toString() {
		return "Battery [model=" + model + ", name=" + name + ", power="
				+ power + "]";
	}
	
}
