package Demo08;

public class Test {
	public static void main(String[] args) {
		Hero hero=new Hero();
		hero.name="����";
		hero.lifeValue=3000;
		Monster monster=new Monster();
		monster.name="ʯͷ��";
		monster.lifeValue=2000;
		monster.type="Ԫ��";
		Weapons weapons=new Weapons();
		weapons.name="�޾�֮��";
		weapons.damage=90;
		hero.show();
		System.out.println();
		monster.show();
		System.out.println();
		weapons.show();
	}

}
