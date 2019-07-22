package Demo08;

public class Test {
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.name="盖伦";
		hero.lifeValue=3000;
		Monster monster=new Monster();
		monster.name="石头人";
		monster.lifeValue=2000;
		monster.type="元素";
		Weapons weapons=new Weapons();
		weapons.name="无尽之刃";
		weapons.damage=90;
		hero.show();
		System.out.println();
		monster.show();
		System.out.println();
		weapons.show();
	}

}
