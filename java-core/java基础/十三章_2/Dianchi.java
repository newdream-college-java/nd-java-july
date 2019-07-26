package 十三章_2;

public class Dianchi {
	String brand;
	String power;
	String type;

	public void chongdian() {
		System.out.println(brand + "品牌的电池正在充电");
	}

	public void fangdian() {
		System.out.println(brand + "品牌的电池正在放电");
	}

	public String returnbrand() {
		return brand;
	}

	public String returnpower() {
		return power;
	}

	public String returntype() {
		return type;
	}

	@Override
	public String toString() {
		return "Dianchi [brand=" + brand + ", power=" + power + ", type="
				+ type + "]";
	}

	public void alterbrand(String newbrand) {
		brand = newbrand;
	}

	public void alterpower(String newpower) {
		power = newpower;
	}

	public void altertype(String newtype) {
		type = newtype;
	}

}
