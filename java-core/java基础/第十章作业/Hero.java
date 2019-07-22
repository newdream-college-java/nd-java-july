package Chapter10_类与对象;

/*
	英雄类：属性:名字、生命值;方法:输出基本信息
*/

public class Hero {
	String name;
	String healthPoint;
	
	public void show() {
		System.out.println("英雄名字:"+name+",生命值:"+healthPoint);
	}
}
