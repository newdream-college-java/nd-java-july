package Jul22;

public class Points {
	/*1.2������˵�� 
ʵ�ֻ��ֻ�������:�𿨿ͻ����ִ��� 1000 �ֻ��տ��ͻ����ִ��� 5000����û���
���� 500 �֡������ͻ�����������õ��Ļ�������*/
	int points;
	String card;
	
	public void result(){
		System.out.println("���֣�"+points+",�����ͣ�"+card);
		if(card.equals("��")&&points>1000||card.equals("�տ�")&&points>5000){
			System.out.println("��������500�֣�");
		}
	}
}
