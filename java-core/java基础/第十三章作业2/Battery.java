package ��ʮ������ҵ2;
/*1.6��дһ���ĵ���࣬���������ԣ�Ʒ�ƣ����ʣ��ͺš�
�����з�����*/
public class Battery {
	String brand;
	String power;
	String type;
	/*
	 ��һ���޷��أ��޲����ķ�����
	��س��ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڳ�硱��
	��طŵ�ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڷŵ硱������
	*/
	public void getChargeStates() {
		System.out.println(brand+"Ʒ�Ƶĵ�����ڳ��");
	}
	public void getDischargeStates() {
		System.out.println(brand+"Ʒ�Ƶĵ�����ڷŵ�");
	}
	/*�������з��أ��޲����ķ�����
	�õ���ص�Ʒ�Ʒ�����Ҫ�󷵻ص�ǰ��ص�Ʒ�ơ�
	�õ���صĹ��ʵķ�����Ҫ�󷵻ص�ǰ��صĹ��ʡ�
	�õ���ص��ͺŵķ�����Ҫ�󷵻ص�ǰ��ص��ͺš�
	���ص�ǰ������Ϣ�ķ������� toString()������
	*/
	public String getBrand() {
		return brand;
	}
	public String getPower() {
		return power;
	}
	public String getType() {
		return type;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", power=" + power + ", type=" + type + "]";
	}
	/*�������޷��أ��в����ķ�����
	���õ�ǰ��ص�Ʒ�Ʒ�����Ҫ�����ص���Ʒ�ƣ��޸ĵ�ǰƷ�ơ�
	���õ�ǰ��صĹ��ʷ�����Ҫ�����ص��¹��ʣ��޸ĵ�ǰ���ʡ�
	���õ�ǰ��ص��ͺŷ�����Ҫ�����ص����ͺţ��޸ĵ�ǰ�ͺš�*/
	public void upDateBrand(String b) {
		brand=b;
		System.out.println(brand);
	}
	public void upDatePower(String p) {
		power=p;
		System.out.println(power);
	}
	public void upDateType(String t) {
		type=t;
		System.out.println(type);
	}
}
