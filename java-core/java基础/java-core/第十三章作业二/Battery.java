package chapter_13_2;
/*1.6、写一个的电池类，类中有属性：品牌，功率，型号。*/
public class Battery {
	//属性
	String brand;
	String power;
	String model;
	/*方法一  （一）无返回，无参数的方法：电池充电的方法，要求输出“某某品牌的电池正在充电”。电池放电的方法，要求输出“某某品牌的电池正在放电”。”。*/
	public void charge(){
		System.out.println(brand+"的电池正在充电");
	}
	public void disCharge(){
		System.out.println(brand+"的电池正在放电");
	}
	/*（二）有返回，无参数的方法：得到电池的品牌方法，要求返回当前电池的品牌。得到电池的功率的方法，要求返回当前电池的功率。得到电池的型号的方法，要求返回当前电池的型号。
	 返回当前对象信息的方法，即 toString()方法。*/
	public String getBrand(){
		return "电池的品牌是："+brand;
	}
	public String getPower(){
		return "电池的功率是："+power;
	}
	public String getModel(){
		return "电池的型号是："+model;
	}
	public String toString(){
		return "电池的品牌是："+brand+"\t电池的品牌是："+brand+"\t电池的型号是："+model;
	}
	
	/*（三）无返回，有参数的方法：设置当前电池的品牌方法，要求传入电池的新品牌，修改当前品牌。设置当前电池的功率方法，要求传入电池的新功率，修改当前功率。
	设置当前电池的型号方法，要求传入电池的新型号，修改当前型号。*/
	public void update(String brandx,String powerx,String modelx){
		brand=brandx;
		power=powerx;
		model=modelx;
		System.out.println("电池的品牌是："+brand+"\t电池的品牌是："+brand+"\t电池的型号是："+model);
	}
	public static void main(String[] args) {
		Battery b1=new Battery();
		b1.brand="南孚";
		b1.model="T-35";
		b1.power="6W";
		b1.charge();
		b1.disCharge();
		System.out.println(b1.getBrand());
		System.out.println(b1.getModel());
		System.out.println(b1.getPower());
		System.out.println(b1.toString());
		b1.update("手机电池", "8W", "A-66");
		
	}
	
}
