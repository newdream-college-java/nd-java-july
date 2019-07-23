public class monster {
	// 怪物类(属性:怪物名字、生命值、类型;方法:输出基本信息)
	String name = "皮皮虾";
	double life = 100;
	String type = "海鲜类";

	public void show() {
		System.out.println("怪物名字" + name + "生命" + life + "类型" + type);
	}
}
