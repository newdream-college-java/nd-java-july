package job02.text7;

/**
 * @author xqx
 *
 */
public class Battery {
	static String brand;
	static String type;
	static String power;
	
	
	//��һ���޷��أ��޲����ķ�����
	/**
	 * 1.��س��ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڳ�硱��
	 */
	public void chongDian() {
		System.out.println(brand+"���ڳ�硣");
	}
	
	/**
	 * 2.��طŵ�ķ�����Ҫ�������ĳĳƷ�Ƶĵ�����ڷŵ硱������
	 */
	 public void fangDian() {
		 System.out.println(brand+"���ڷŵ硣");
	 }
	 
	 //�������з��أ��޲����ķ�����
	/**
	 * 3.�õ���ص�Ʒ�Ʒ�����Ҫ�󷵻ص�ǰ��ص�Ʒ�ơ�
	 */
	 public String getBrand() {
		 return brand;
	 }
	 
	/**
	 * 4.�õ���صĹ��ʵķ�����Ҫ�󷵻ص�ǰ��صĹ��ʡ�
	 */
	 public String getPower() {
		 return power;
	 }
	 
	/**
	 * 5.�õ���ص��ͺŵķ�����Ҫ�󷵻ص�ǰ��ص��ͺš�
	 */
	 public String getType() {
		 return type;
	 }
	/**
	 * 6.���ص�ǰ������Ϣ�ķ������� toString()������
	 */
	 public String toString() {
		 return "Ʒ�ƣ�"+brand+"\t�ͺţ�"+type+"\t���ʣ�"+power;
	 }
	
	
	
	 //�������޷��أ��в����ķ�����
	/**
	 * 7.���õ�ǰ��ص�Ʒ�Ʒ�����Ҫ�����ص���Ʒ�ƣ��޸ĵ�ǰƷ�ơ�
	 */
	 public void settingBrand(String nbrand) {
		 brand=nbrand;
		 System.out.println("��ǰƷ�ƣ�"+brand);
	 }
	 
	/**
	 *8.���õ�ǰ��صĹ��ʷ�����Ҫ�����ص��¹��ʣ��޸ĵ�ǰ���ʡ�
	 */
	 public void settingPower(String npower) {
		 power=npower;
		 System.out.println("��ǰ���ʣ�"+power);
	 }
	 
	/**
	 * 9.���õ�ǰ��ص��ͺŷ�����Ҫ�����ص����ͺţ��޸ĵ�ǰ�ͺš�
	 */
	 public void settingType(String ntype) {
		 type=ntype;
		 System.out.println("��ǰ�ͺţ�"+type);
	 }
	 
	
	
	
}
