package Jul22;

public class TestGame {

	/**
	 * @param args
	 */
	/*
	 * 1.8����˾��������Ϸ������������˼�����Ӣ���ࡢ�������������;��д����
�࣬����Ӣ �۶��󡢹��������������󣬲�������Ե���Ϣ�������趨�ֱ�����: 
Ӣ����(����:���֡�����ֵ;����:���������Ϣ) ������(����:�������֡�����ֵ��
����;����:���������Ϣ) ������(����:�������֡�������;����:���������Ϣ) */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero();
		hero.���� = "�¸��";
		hero.����ֵ = "10000";
		hero.showInfo();
		
		Monster mon = new Monster();
		mon.�������� = "�¸��";
		mon.����ֵ = "10000";
		mon.showInfo();
		
		Weapon wpn = new Weapon();
		wpn.�������� = "�¸��";
		wpn.������ = "10000";
		wpn.showInfo();
		
		
	}

}
