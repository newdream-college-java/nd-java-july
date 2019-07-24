package 第10章作业;

/*
	公司开发新游戏，用面向对象的思想设计英雄类、怪物类和武器类;编写测试
	类，创建英 雄对象、怪物对象和武器对象，并输出各自的信息，其中设定分别如下:
	英雄类(属性:名字、生命值;方法:输出基本信息) 怪物类(属性:怪物名字、生命值、
	类型;方法:输出基本信息) 武器类(属性:武器名字、攻击力;方法:输出基本信息) 
*/

public class Game {


	public static void main(String[] args) {
		Hero hero=new Hero();
		Monster monster=new Monster();
		Weapon weapon=new Weapon();
		hero.name="亚瑟";
		hero.healthPoint="100";
		monster.name="死鬼";
		monster.healthPoint="100";
		monster.type="精英怪";
		weapon.name="大刀";
		weapon.ATK="30";
		hero.show();
		monster.show();
		weapon.show();
	}

}
