package chapter_13_2;
/*1.6��дһ���ĵ���࣬���������ԣ�Ʒ�ƣ����ʣ��ͺš�*/
public class Battery {
	//����
	String brand;
	String power;
	String model;
	/*����һ  ��һ���޷��أ��޲����ķ�������س��ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڳ�硱����طŵ�ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڷŵ硱������*/
	public void charge(){
		System.out.println(brand+"�ĵ�����ڳ��");
	}
	public void disCharge(){
		System.out.println(brand+"�ĵ�����ڷŵ�");
	}
	/*�������з��أ��޲����ķ������õ���ص�Ʒ�Ʒ�����Ҫ�󷵻ص�ǰ��ص�Ʒ�ơ��õ���صĹ��ʵķ�����Ҫ�󷵻ص�ǰ��صĹ��ʡ��õ���ص��ͺŵķ�����Ҫ�󷵻ص�ǰ��ص��ͺš�
	 ���ص�ǰ������Ϣ�ķ������� toString()������*/
	public String getBrand(){
		return "��ص�Ʒ���ǣ�"+brand;
	}
	public String getPower(){
		return "��صĹ����ǣ�"+power;
	}
	public String getModel(){
		return "��ص��ͺ��ǣ�"+model;
	}
	public String toString(){
		return "��ص�Ʒ���ǣ�"+brand+"\t��ص�Ʒ���ǣ�"+brand+"\t��ص��ͺ��ǣ�"+model;
	}
	
	/*�������޷��أ��в����ķ��������õ�ǰ��ص�Ʒ�Ʒ�����Ҫ�����ص���Ʒ�ƣ��޸ĵ�ǰƷ�ơ����õ�ǰ��صĹ��ʷ�����Ҫ�����ص��¹��ʣ��޸ĵ�ǰ���ʡ�
	���õ�ǰ��ص��ͺŷ�����Ҫ�����ص����ͺţ��޸ĵ�ǰ�ͺš�*/
	public void update(String brandx,String powerx,String modelx){
		brand=brandx;
		power=powerx;
		model=modelx;
		System.out.println("��ص�Ʒ���ǣ�"+brand+"\t��ص�Ʒ���ǣ�"+brand+"\t��ص��ͺ��ǣ�"+model);
	}
	public static void main(String[] args) {
		Battery b1=new Battery();
		b1.brand="����";
		b1.model="T-35";
		b1.power="6W";
		b1.charge();
		b1.disCharge();
		System.out.println(b1.getBrand());
		System.out.println(b1.getModel());
		System.out.println(b1.getPower());
		System.out.println(b1.toString());
		b1.update("�ֻ����", "8W", "A-66");
		
	}
	
}
