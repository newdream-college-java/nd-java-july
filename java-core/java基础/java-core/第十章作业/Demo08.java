package chapter_10;
/*1.8、公司开发新游戏，用面向对象的思想设计英雄类、怪物类和武器类;编写测试
类，创建英 雄对象、怪物对象和武器对象，并输出各自的信息，其中设定分别如下: 
英雄类(属性:名字、生命值;方法:输出基本信息) 怪物类(属性:怪物名字、生命值、
类型;方法:输出基本信息) 武器类(属性:武器名字、攻击力;方法:输出基本信息)*/
public class Demo08 {

	public static void main(String[] args) {
		//创建英雄对象属性
		Hero hero01=new Hero();
		hero01.name="李白";
		hero01.smz="3589";
		hero01.show();
		//创建怪物对象
		Guaiwu guaiwu01=new Guaiwu();
		guaiwu01.name="黑暗暴君";
		guaiwu01.smz="66666";
		guaiwu01.type="黑龙";
		guaiwu01.show();
		//创建武器对象
		Wuqi wuqi01=new Wuqi();
		wuqi01.name="破军";
		wuqi01.gjl="270";
		wuqi01.show();
		

	}

}
