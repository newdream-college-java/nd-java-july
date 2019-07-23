package 第十章;

public class TestNewGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		英雄 hero = new 英雄();
		hero.name = "帅帅";
		hero.Hp = 10000;
		怪物 monster = new 怪物();
		monster.name = "哥斯拉";
		monster.HP = 99999;
		武器 arms = new 武器();
		arms.ATK = 999;
		arms.name = "圣剑";
		System.out.println(hero);
		System.out.println(monster);
		System.out.println(arms);
	}

}
