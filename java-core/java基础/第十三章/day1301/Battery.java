package work;

/**
 * 1.6��дһ���ĵ���࣬���������ԣ�Ʒ�ƣ����ʣ��ͺš�
	�����з�����
��һ���޷��أ��޲����ķ�����
��س��ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڳ�硱��
��طŵ�ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڷŵ硱������
�������з��أ��޲����ķ�����
�õ���ص�Ʒ�Ʒ�����Ҫ�󷵻ص�ǰ��ص�Ʒ�ơ�
�õ���صĹ��ʵķ�����Ҫ�󷵻ص�ǰ��صĹ��ʡ�
�õ���ص��ͺŵķ�����Ҫ�󷵻ص�ǰ��ص��ͺš�
���ص�ǰ������Ϣ�ķ������� toString()������
�������޷��أ��в����ķ�����
���õ�ǰ��ص�Ʒ�Ʒ�����Ҫ�����ص���Ʒ�ƣ��޸ĵ�ǰƷ�ơ�
���õ�ǰ��صĹ��ʷ�����Ҫ�����ص��¹��ʣ��޸ĵ�ǰ���ʡ�
���õ�ǰ��ص��ͺŷ�����Ҫ�����ص����ͺţ��޸ĵ�ǰ�ͺš�
 */

public class Battery {
	String brand = "С��" ;
	String power = "30W";
	String type = "ABC�ͺ�";
	public void eIn() {
		System.out.println(brand+"Ʒ�Ƶĵ�����ڳ��");
	}
	public void eOut() {
		System.out.println(brand+"Ʒ�Ƶĵ�����ڷŵ�");
	}
	
	public String getBrand() {
		return brand;
	}
	public String getPower() {
		return power;
	}
	public String getType() {
		return type;
	}
	public void setBrand(String s) {
		brand = s;
	}
	public void setPower(String s) {
		power = s;
	}
	public void setType(String s) {
		type = s;
	}
	
	public static void main(String[] args) {
		Battery battery = new Battery();
		battery.eIn();
		battery.eOut();
		battery.setBrand("��Ϊ");
		battery.setPower("100W");
		battery.setType("DEF��");
		System.out.println(battery.getBrand());
		System.out.println(battery.getPower());
		System.out.println(battery.getType());
		
	}

}
