package 第10章作业;

/*
	怪兽类：属性:怪物名字、生命值、方法:输出基本信息
*/

public class Monster {
	String name;
	String healthPoint;
	String type;
	public void show() {
		System.out.println("怪物名字:"+name+",生命值:"+healthPoint+",type:"+type);
	}
}
