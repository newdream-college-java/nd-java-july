package 十三章_2;

public class Customer {
	String name;
	int age;
	boolean huiyuan;

	@Override
	public String toString() {
		return "Customer [age=" + age + ", huiyuan=" + huiyuan + ", name="
				+ name + "]";
	}

	public void addCustomer(String addname, int addage, boolean addhuiyuan) {
		name = addname;
		age = addage;
		huiyuan = addhuiyuan;
	}
}
