package chapter_10;
/*1.8����˾��������Ϸ������������˼�����Ӣ���ࡢ�������������;��д����
�࣬����Ӣ �۶��󡢹��������������󣬲�������Ե���Ϣ�������趨�ֱ�����: 
Ӣ����(����:���֡�����ֵ;����:���������Ϣ) ������(����:�������֡�����ֵ��
����;����:���������Ϣ) ������(����:�������֡�������;����:���������Ϣ)*/
public class Demo08 {

	public static void main(String[] args) {
		//����Ӣ�۶�������
		Hero hero01=new Hero();
		hero01.name="���";
		hero01.smz="3589";
		hero01.show();
		//�����������
		Guaiwu guaiwu01=new Guaiwu();
		guaiwu01.name="�ڰ�����";
		guaiwu01.smz="66666";
		guaiwu01.type="����";
		guaiwu01.show();
		//������������
		Wuqi wuqi01=new Wuqi();
		wuqi01.name="�ƾ�";
		wuqi01.gjl="270";
		wuqi01.show();
		

	}

}
