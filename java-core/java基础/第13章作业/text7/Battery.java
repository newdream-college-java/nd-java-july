package job02.text7;

/**
 * @author xqx
 *
 */
public class Battery {
	static String brand;
	static String type;
	static String power;
	
	
	//（一）无返回，无参数的方法：
	/**
	 * 1.电池充电的方法，要求输出“某某品牌的电池正在充电”。
	 */
	public void chongDian() {
		System.out.println(brand+"正在充电。");
	}
	
	/**
	 * 2.电池放电的方法，要求输出“某某品牌的电池正在放电”。”。
	 */
	 public void fangDian() {
		 System.out.println(brand+"正在放电。");
	 }
	 
	 //（二）有返回，无参数的方法：
	/**
	 * 3.得到电池的品牌方法，要求返回当前电池的品牌。
	 */
	 public String getBrand() {
		 return brand;
	 }
	 
	/**
	 * 4.得到电池的功率的方法，要求返回当前电池的功率。
	 */
	 public String getPower() {
		 return power;
	 }
	 
	/**
	 * 5.得到电池的型号的方法，要求返回当前电池的型号。
	 */
	 public String getType() {
		 return type;
	 }
	/**
	 * 6.返回当前对象信息的方法，即 toString()方法。
	 */
	 public String toString() {
		 return "品牌："+brand+"\t型号："+type+"\t功率："+power;
	 }
	
	
	
	 //（三）无返回，有参数的方法：
	/**
	 * 7.设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。
	 */
	 public void settingBrand(String nbrand) {
		 brand=nbrand;
		 System.out.println("当前品牌："+brand);
	 }
	 
	/**
	 *8.设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
	 */
	 public void settingPower(String npower) {
		 power=npower;
		 System.out.println("当前功率："+power);
	 }
	 
	/**
	 * 9.设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。
	 */
	 public void settingType(String ntype) {
		 type=ntype;
		 System.out.println("当前型号："+type);
	 }
	 
	
	
	
}
