/*ʵ�ֻ��ֻ�������:�𿨿ͻ����ִ��� 1000 �ֻ��տ��ͻ����ִ��� 5000����û���
���� 500 �֡������ͻ�����������õ��Ļ�������*/
package Demo02;

public class Customer {
	int integral;
	String cardType;
	public void show(){
		if(cardType.equals("��")){
			System.out.println("���֣�"+integral+",������:"+cardType);
			if(integral>1000){
				System.out.println("��������500�֣�");
			}
		}else{
			System.out.println("���֣�"+integral+",������:"+cardType);
			if(integral>5000){
				System.out.println("��������500�֣�");
			}
		}
	}
}
