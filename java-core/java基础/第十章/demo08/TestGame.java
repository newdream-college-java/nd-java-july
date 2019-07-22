package Jul22;

public class TestGame {

	/**
	 * @param args
	 */
	/*
	 * 1.8、公司开发新游戏，用面向对象的思想设计英雄类、怪物类和武器类;编写测试
类，创建英 雄对象、怪物对象和武器对象，并输出各自的信息，其中设定分别如下: 
英雄类(属性:名字、生命值;方法:输出基本信息) 怪物类(属性:怪物名字、生命值、
类型;方法:输出基本信息) 武器类(属性:武器名字、攻击力;方法:输出基本信息) */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero();
		hero.名字 = "陈哥哥";
		hero.生命值 = "10000";
		hero.showInfo();
		
		Monster mon = new Monster();
		mon.怪物名字 = "陈哥哥";
		mon.生命值 = "10000";
		mon.showInfo();
		
		Weapon wpn = new Weapon();
		wpn.武器名字 = "陈哥哥";
		wpn.攻击力 = "10000";
		wpn.showInfo();
		
		
	}

}
