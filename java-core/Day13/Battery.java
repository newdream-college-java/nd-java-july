/**
 * дһ���ĵ���࣬���������ԣ�Ʒ�ƣ����ʣ��ͺš�
 * @author 54975
 *
 */
public class Battery {
	//Ʒ��
	String name="����";
	//����
	String power="2500";
	//�ͺ�
	String model="x86";
	/**
	 * ��س��ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڳ�硱��
	 */
	public void getshow(){
		System.out.println(name+"Ʒ�Ƶĵ�����ڳ��");
	}
	/**
	 * ��طŵ�ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڷŵ硱������
	 */
	public void setshow(){
		System.out.println(name+"Ʒ�Ƶĵ�����ڳ��");
	}
	/**
	 * 	�õ���ص�Ʒ�Ʒ�����Ҫ�󷵻ص�ǰ��ص�Ʒ�ơ�
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * ���õ�ǰ��ص�Ʒ�Ʒ�����Ҫ�����ص���Ʒ�ƣ��޸ĵ�ǰƷ�ơ�
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * �õ���صĹ��ʵķ�����Ҫ�󷵻ص�ǰ��صĹ��ʡ�
	 * @return
	 */
	public String getPower() {
		return power;
	}
	/**
	 * ���õ�ǰ��صĹ��ʷ�����Ҫ�����ص��¹��ʣ��޸ĵ�ǰ���ʡ�
	 * @param power
	 */
	public void setPower(String power) {
		this.power = power;
	}
	/**
	 * �õ���ص��ͺŵķ�����Ҫ�󷵻ص�ǰ��ص��ͺš�
	 * @return
	 */
	public String getModel() {
		return model;
	}
	/**
	 * ���õ�ǰ��ص��ͺŷ�����Ҫ�����ص����ͺţ��޸ĵ�ǰ�ͺš�
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * ���ص�ǰ������Ϣ�ķ������� toString()������
	 */
	public String toString() {
		return "Battery [model=" + model + ", name=" + name + ", power="
				+ power + "]";
	}
	
}
