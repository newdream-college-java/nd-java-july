/*1.6��дһ���ĵ���࣬���������ԣ�Ʒ�ƣ����ʣ��ͺš�
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
package demo07;

public class Battery {
	String brand="��Ϊ";
	int power=3000;
	String model="v2";
	//��һ���޷��أ��޲����ķ�����
	//��س��ķ���
	public void charging(){
		System.out.println("ĳĳƷ�Ƶĵ�����ڳ��");
	}
	//��طŵ�ķ���
	public void discharge(){
		System.out.println("ĳĳƷ�Ƶĵ�����ڷŵ�");
	}
	//�������з��أ��޲����ķ�����
	//�õ���ص�Ʒ�Ʒ���
	public String getbrand(){
		return brand;
	}
	//�õ���صĹ��ʵķ���
	public int getpower(){
		return power;
	}
	//�õ���ص��ͺŵķ���
	public String getmodel(){
		return model;
	}
	//�������޷��أ��в����ķ�����
	//�޸ĵ�ǰƷ��
	public void xgbrand(String xbrand){
		brand=xbrand;
	}
	//�޸ĵ�ǰ����
	public void xgpower(int xpower){
		power=xpower;
	}
	//�޸ĵ�ǰ�ͺ�
	public void xgmodel(String xmodel){
		model=xmodel;
	}
	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", model=" + model + ", power="
				+ power + "]";
	}
	
}
